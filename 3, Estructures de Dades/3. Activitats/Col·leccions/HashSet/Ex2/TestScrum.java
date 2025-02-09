package Collections.HashSet.Ex2;

import java.util.Scanner;

public class TestScrum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScrumManager scrumManager = new ScrumManager();

        while (true) {
            System.out.println("\nSelecciona una opció:");
            System.out.println("1. Afegir tasca");
            System.out.println("2. Passar de TO BE DONE a DOING");
            System.out.println("3. Passar de DOING a DONE");
            System.out.println("4. Mostrar l'estat actual de les tasques");
            System.out.println("5. Sortir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // To consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Introdueix el nom de la tasca: ");
                    String name = scanner.nextLine();
                    System.out.print("Introdueix la descripció de la tasca: ");
                    String description = scanner.nextLine();
                    scrumManager.addTask(name, description);
                    break;

                case 2:
                    System.out.print("Introdueix el nom de la tasca a passar de TO BE DONE a DOING: ");
                    String taskToDo = scanner.nextLine();
                    scrumManager.moveToDoing(taskToDo);
                    break;

                case 3:
                    System.out.print("Introdueix el nom de la tasca a passar de DOING a DONE: ");
                    String taskDone = scanner.nextLine();
                    scrumManager.moveToDone(taskDone);
                    break;

                case 4:
                    scrumManager.showTaskStates();
                    break;

                case 5:
                    System.out.println("Sortint del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opció no vàlida.");
            }
        }
    }
}