package POO.ProjecteNadal;

import java.util.*;
import java.time.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cycle cycle = createCycle();
        Module module = createModule(cycle);

        while (true) {
            showMenu();
            int choice = getUserChoice(sc);

            switch (choice) {
                case 1:
                    searchByName(sc);
                    break;
                case 2:
                    searchByEmail(sc);
                    break;
                case 3:
                    searchByModule(sc, module);
                    break;
                case 0:
                    System.out.println("Sortint... Fins aviat!");
                    return;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        }
    }

    private static Cycle createCycle() {
        Cycle cycle = new Cycle("Informàtica");
        return cycle;
    }

    private static Module createModule(Cycle cycle) {
        Module module = new Module("Programació");
        Professor[] professors = createProfessors();
        addProfessorsToModule(module, professors);
        cycle.addModule(1, module);
        return module;
    }

    private static Professor[] createProfessors() {
        Professor amontero = new Professor("12345678A", "Alberto", "Montero", "amontero@iespoblenou.org");
        Professor gplazas = new Professor("12345678B", "Ginés", "Plazas", "gplazas@iespoblenou.org");
        Professor pbea = new Professor("12345678C", "Pep", "Bea", "pbea@iespoblenou.org");
        Professor nafkir = new Professor("12345678D", "Nasser", "Afkir", "nafkir@iespoblenou.org");
        Professor oyll = new Professor("12345678E", "Oscar", "Yll", "oyll@iespoblenou.org");
        Professor jrlopez = new Professor("12345678F", "Joan Ramon", "López", "jrlopez@iespoblenou.org");
        Professor gspagnuolo = new Professor("12345678G", "Gonzalo", "Spagnuolo", "gspagnuolo@iespoblenou.org");

        // Assignar horaris lliures per als professors
        setProfessorAvailability(amontero, "10:00", "11:00", "14:00", "2025-01-10");
        setProfessorAvailability(gplazas, "09:00", "12:00", "15:00", "2025-01-12");
        setProfessorAvailability(pbea, "08:00", "10:00", "12:00", "2025-01-11");
        setProfessorAvailability(nafkir, "09:00", "13:00", "16:00", "2025-01-13");
        setProfessorAvailability(oyll, "11:00", "14:00", "16:00", "2025-01-14");
        setProfessorAvailability(jrlopez, "10:00", "12:00", "15:00", "2025-01-15");
        setProfessorAvailability(gspagnuolo, "09:00", "13:00", "17:00", "2025-01-16");

        return new Professor[] { amontero, gplazas, pbea, nafkir, oyll, jrlopez, gspagnuolo };
    }

    private static void setProfessorAvailability(Professor professor, String hour1, String hour2, String hour3, String date) {
        professor.setAvailability(date, hour1, true);
        professor.setAvailability(date, hour2, true);
        professor.setAvailability(date, hour3, true);
    }

    private static void addProfessorsToModule(Module module, Professor[] professors) {
        for (Professor professor : professors) {
            module.addProfessor(professor);
        }
    }

    private static void showMenu() {
        System.out.println("\n---- FES UNA RESERVA ----");
        System.out.println("1. Cerca per nom");
        System.out.println("2. Cerca per correu");
        System.out.println("3. Cerca per mòduls");
        System.out.println("0. Sortir");
    }

    private static int getUserChoice(Scanner sc) {
        System.out.print("Tria una opció: ");
        return sc.nextInt();
    }

    private static void searchByName(Scanner sc) {
        while (true) {
            System.out.println("\n1. Mostra tots els professors");
            System.out.println("2. Cerca un professor");
            System.out.println("3. Torna enrere");
            System.out.println("0. Sortir");
            System.out.print("Tria una opció: ");

            int subChoice = sc.nextInt();
            sc.nextLine();

            switch (subChoice) {
                case 1:
                    showAllProfessors();
                    break;
                case 2:
                    searchProfessorByName(sc);
                    return;  // Tornar enrere després de fer la cerca
                case 3:
                    return;  // Tornar enrere
                case 0:
                    System.out.println("Sortint... Adéu!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        }
    }

    private static void showAllProfessors() {
        List<String> professors = getAllProfessors();
        for (String professor : professors) {
            System.out.println(professor);
        }
    }

    private static List<String> getAllProfessors() {
        System.out.println("\nProfessors Institut Poblenou:");
        List<String> professors = new ArrayList<>();
        professors.add("Alberto Montero");
        professors.add("Ginés Plazas");
        professors.add("Pep Bea");
        professors.add("Nasser Afkir");
        professors.add("Oscar Yll");
        professors.add("Joan Ramon López");
        professors.add("Gonzalo Spagnuolo");
        return professors;
    }

    private static void searchProfessorByName(Scanner sc) {
        String fullName;
        while (true) {
            System.out.print("Introdueix el nom complet del professor: ");
            fullName = sc.nextLine();
            Professor professor = findProfessorByName(fullName);

            if (professor != null) {
                makeBook(sc, professor);
                break;
            } else {
                System.out.println("No s'ha trobat cap professor amb aquest nom.");
                System.out.print("Vols intentar-ho de nou? (S/N): ");
                String tryAgain = sc.nextLine();
                if (!tryAgain.equalsIgnoreCase("S")) break;
            }
        }
    }

    private static Professor findProfessorByName(String fullName) {
        return switch (fullName.toLowerCase()) {
            case "alberto montero" -> new Professor("12345678A", "Alberto", "Montero", "amontero@iespoblenou.org");
            case "ginés plazas" -> new Professor("12345678B", "Ginés", "Plazas", "gplazas@iespoblenou.org");
            case "pep bea" -> new Professor("12345678C", "Pep", "Bea", "pbea@iespoblenou.org");
            default -> null;
        };
    }

    private static void searchByEmail(Scanner sc) {
        String email;
        while (true) {
            System.out.print("Introdueixi el correu: ");
            email = sc.nextLine();
            Professor professor = findProfessorByEmail(email);

            if (professor != null) {
                System.out.println("Professor trobat: " + professor.getFullName());

                makeBook(sc, professor);
                break;
            } else {
                System.out.println("No s'ha trobat cap professor amb aquest correu.");
                System.out.print("Vols intentar-ho de nou? (S/N): ");
                String tryAgain = sc.nextLine();
                if (!tryAgain.equalsIgnoreCase("S")) break;
            }
        }
    }

    private static Professor findProfessorByEmail(String email) {
        return switch (email.toLowerCase()) {
            case "amontero@iespoblenou.org" -> new Professor("12345678A", "Alberto", "Montero", email);
            case "gplazas@iespoblenou.org" -> new Professor("12345678B", "Ginés", "Plazas", email);
            default -> null;
        };
    }

    private static void searchByModule(Scanner sc, Module module) {
        System.out.println("Mòduls disponibles:");
        System.out.println(module.getName());
        System.out.print("Selecciona un mòdul: ");
        sc.nextLine(); String moduleName = sc.nextLine();
        if (module.getName().equalsIgnoreCase(moduleName)) {
            System.out.println("Professors del mòdul " + moduleName + ":");
            for (Professor p : module.getProfessors()) {
                System.out.println(p.getFullName());
            }
            System.out.print("Selecciona un professor: ");
            sc.nextLine();String professorName = sc.nextLine();
            Professor professor = findProfessorByName(professorName);

            if (professor != null) {
                makeBook(sc, professor);
            } else {
                System.out.println("No s'ha trobat cap professor amb aquest nom.");
            }
        } else {
            System.out.println("No s'ha trobat cap mòdul amb aquest nom.");
        }
    }

    private static void showProfessorAvailability(Professor professor) {
        LocalDate today = LocalDate.now();
        LocalDate minDate = today.plusDays(1);  // Prevent booking for today or in the past

        System.out.println("Horari disponible del professor " + professor.getFullName() + ":");

        // Loop through the available dates of the professor
        for (Map.Entry<String, Map<String, Boolean>> entry : professor.getAvailability().entrySet()) {
            String date = entry.getKey();  // The date
            Map<String, Boolean> hours = entry.getValue();  // The hours available for that date

            // If the date is in the future and not a weekend
            LocalDate dateObj = LocalDate.parse(date);
            if (dateObj.isAfter(minDate) && dateObj.getDayOfWeek() != DayOfWeek.SATURDAY && dateObj.getDayOfWeek() != DayOfWeek.SUNDAY) {
                System.out.println("Date: " + date);

                // Loop through the available hours for that date
                for (Map.Entry<String, Boolean> hourEntry : hours.entrySet()) {
                    String hour = hourEntry.getKey();
                    boolean isAvailable = hourEntry.getValue();
                    System.out.println("  Hour: " + hour + " - " + (isAvailable ? "Available" : "Not available"));
                }
            }
        }
    }

    private static void makeBook(Scanner sc, Professor professor) {
        LocalDate today = LocalDate.now();
        LocalDate minDate = today.plusDays(1);  // Prevent booking for today or in the past

        showProfessorAvailability(professor);

        // Loop through the professor's available dates
        for (String date : professor.getAvailableDates()) {
            LocalDate dateObj = LocalDate.parse(date);

            // Only show future dates and exclude weekends
            if (dateObj.isAfter(minDate) && dateObj.getDayOfWeek() != DayOfWeek.SATURDAY && dateObj.getDayOfWeek() != DayOfWeek.SUNDAY) {
                System.out.println("Data: " + date);

                // Loop through the time slots available for this date
                for (String timeSlot : professor.getAvailableTimeSlots(date)) {
                    boolean isAvailable = professor.isAvailable(date, timeSlot);
                    System.out.println("Hora: " + timeSlot + " - " + (isAvailable ? "Disponible" : "No Disonible"));
                }
            }
        }

        System.out.print("Introdueix una data i hora per realizar la cita (Ex: 2025-01-10 10:00): ");
        String input = sc.nextLine();

        // Split the input into date and time components
        String[] parts = input.split(" ");
        String date = parts[0];
        String timeSlot = parts[1];

        // Check if the professor is available at the requested time
        if (professor.isAvailable(date, timeSlot)) {
            Appointment appointment = new Appointment(date, timeSlot, professor, "Room 101");
            System.out.println(appointment.getDetails());
        } else {
            System.out.println("El professor no está disponible en aquest horari.");
            System.out.print("Vols tornar a intentar-ho? (Sí/No): ");
            String tryAgain = sc.nextLine();
            if (tryAgain.equalsIgnoreCase("yes")) {
                makeBook(sc, professor);
            } else {
                System.out.println("No s'ha trobat cap professor.");
            }
        }
        sc.close();
    }
}