package Collections.HashSet.Ex2;

import java.util.HashSet;
import java.util.Set;

class ScrumManager {
    private Set<Task> toBeDone;
    private Set<Task> doing;
    private Set<Task> done;

    public ScrumManager() {
        toBeDone = new HashSet<>();
        doing = new HashSet<>();
        done = new HashSet<>();
    }

    public void addTask(String name, String description) {
        Task newTask = new Task(name, description);
        toBeDone.add(newTask);
        System.out.println("Tasques afegida: " + newTask);
    }

    public void moveToDoing(String taskName) {
        for (Task task : toBeDone) {
            if (task.getName().equals(taskName)) {
                toBeDone.remove(task);
                doing.add(task);
                System.out.println("Tasques en procés: " + task);
                return;
            }
        }
        System.out.println("La tasca no existeix a TO BE DONE.");
    }

    public void moveToDone(String taskName) {
        for (Task task : doing) {
            if (task.getName().equals(taskName)) {
                doing.remove(task);
                done.add(task);
                System.out.println("Tasques finalitzada: " + task);
                return;
            }
        }
        System.out.println("La tasca no existeix a DOING.");
    }

    public void showTaskStates() {
        System.out.println("\nTO BE DONE:");
        toBeDone.forEach(task -> System.out.println(task));

        System.out.println("\nDOING:");
        doing.forEach(task -> System.out.println(task));

        System.out.println("\nDONE:");
        done.forEach(task -> System.out.println(task));
    }
}