package Exercici3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private List<Project> projects;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
        projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public boolean removeProject(String title) {
        return projects.removeIf(project ->
                project.getTitle().equalsIgnoreCase(title));
    }

    public double getTotalBudget() {
        double total = 0;
        for (Project project : projects) {
            total += project.getBudget();
        }
        return total;
    }
}