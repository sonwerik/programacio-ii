package POO.Projecte;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creació de mòduls
        Module programacio1 = new Module(1, "Programació 1");
        Module basesDeDades = new Module(2, "Base de dades");
        Module llenguatgesDeMarca = new Module(3, "Llenguatges de Marca");

        // Creació de professors
        Teacher aMontero = new Teacher(1, "Alberto Montero", "amontero@iespoblenou.org");
        Teacher gPlazas = new Teacher(2, "Ginés Plazas", "gplazas@iespoblenou.org");
        Teacher pBea = new Teacher(3, "Pep Bea", "pbea@iespoblenou.org");

        // Assignació de professors als mòduls
        programacio1.getTeachers().add(aMontero);
        basesDeDades.getTeachers().add(gPlazas);
        llenguatgesDeMarca.getTeachers().add(pBea);

        // Llista de mòduls
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(programacio1);
        modules.add(basesDeDades);
        modules.add(llenguatgesDeMarca);

        // Creació d'un alumne
        Student student = new Student();
        student.addStudent(sc);

        // Menú d'opcions
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    
                    ---- MENU ----
                    1. Cercar professor per nom
                    2. Cercar professor per correu
                    3. Veure mòduls i professors
                    4. Crear reserva
                    0. Sortir
                    
                    """);
            System.out.print("Escull una opció: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Introdueix el nom del professor: ");
                    String nameSearch = sc.nextLine();
                    searchTeacherByName(nameSearch, modules);
                    break;
                case 2:
                    System.out.print("Introdueix el correu del professor: ");
                    String emailSearch = sc.nextLine();
                    searchTeacherByEmail(emailSearch, modules);
                    break;
                case 3:
                    showModulesAndTeachers(modules);
                    break;
                case 4:
                    createReservation(sc, modules, student);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Sortint del programa. Adéu!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
            }
        }
    }

    // Mètode per cercar un professor pel nom
    private static void searchTeacherByName(String name, ArrayList<Module> modules) {
        for (Module module : modules) {
            for (Teacher teacher : module.getTeachers()) {
                if (teacher.getTeacherName().equalsIgnoreCase(name)) {
                    System.out.println("Professor trobat: " + teacher);
                    return;
                }
            }
        }
        System.out.println("No s'ha trobat cap professor amb aquest nom.");
    }

    // Mètode per cercar un professor pel correu
    private static void searchTeacherByEmail(String email, ArrayList<Module> modules) {
        for (Module module : modules) {
            for (Teacher teacher : module.getTeachers()) {
                if (teacher.getTeacherMail().equalsIgnoreCase(email)) {
                    System.out.println("Professor trobat: " + teacher);
                    return;
                }
            }
        }
        System.out.println("No s'ha trobat cap professor amb aquest correu.");
    }

    // Mètode per mostrar els mòduls i professors assignats
    private static void showModulesAndTeachers(ArrayList<Module> modules) {
        for (Module module : modules) {
            System.out.println("Mòdul: " + module.getNameModule());
            for (Teacher teacher : module.getTeachers()) {
                System.out.println("  - " + teacher.getTeacherName() + " (" + teacher.getTeacherMail() + ")");
            }
        }
    }

    // Mètode per crear una reserva
    private static void createReservation(Scanner sc, ArrayList<Module> modules, Student student) {
        System.out.println("Selecciona un mòdul:");
        for (int i = 0; i < modules.size(); i++) {
            System.out.println((i + 1) + ". " + modules.get(i).getNameModule());
        }
        int moduleChoice = sc.nextInt();
        sc.nextLine(); // Consumir el salt de línia

        if (moduleChoice < 1 || moduleChoice > modules.size()) {
            System.out.println("Opció no vàlida.");
            return;
        }

        Module selectedModule = modules.get(moduleChoice - 1);
        System.out.println("Selecciona un professor:");
        ArrayList<Teacher> teachers = selectedModule.getTeachers();
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + ". " + teachers.get(i).getTeacherName());
        }
        int teacherChoice = sc.nextInt();
        sc.nextLine();

        if (teacherChoice < 1 || teacherChoice > teachers.size()) {
            System.out.println("Opció no vàlida.");
            return;
        }

        Teacher selectedTeacher = teachers.get(teacherChoice - 1);
        System.out.print("Introdueix la data (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.print("Introdueix l'hora (HH:MM): ");
        LocalTime time = LocalTime.parse(sc.nextLine());

        if (selectedTeacher.isAvailability()) {
            Book reservation = new Book();
            reservation.setDate(date);
            reservation.setTime(time);
            reservation.setTeacher(selectedTeacher);
            reservation.setStudent(student);
            System.out.println("Reserva creada correctament: " + reservation);
        } else {
            System.out.println("El professor no està disponible en aquesta franja.");
        }
    }
}
