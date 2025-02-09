package Collections.HashMap.Ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SCRUM {
    private Map<String, ArrayList<Student>> projects;

    public SCRUM() {
        projects = new HashMap<>();
    }

    public boolean addProject(String projectName) {
        if (projects.containsKey(projectName)) {
            System.out.println("El projecte '" + projectName + "' ja existeix.");
            return false;
        }
        projects.put(projectName, new ArrayList<>());
        System.out.println("Projecte '" + projectName + "' afegit.");
        return true;
    }

    public boolean addStudent(String projectName, Student student) {
        if (!projects.containsKey(projectName)) {
            addProject(projectName);
        }
        ArrayList<Student> team = projects.get(projectName);
        if (team.contains(student)) {
            System.out.println("L'estudiant '" + student.getName() + "' ja forma part del projecte '" + projectName + "'.");
            return false;
        }
        team.add(student);
        System.out.println("Estudiant '" + student.getName() + "' afegit al projecte '" + projectName + "'.");
        return true;
    }

    public boolean removeProject(String projectName) {
        if (projects.containsKey(projectName)) {
            projects.remove(projectName);
            System.out.println("Projecte '" + projectName + "' eliminat.");
            return true;
        } else {
            System.out.println("El projecte '" + projectName + "' no existeix.");
            return false;
        }
    }

    public void showProjects() {
        if (projects.isEmpty()) {
            System.out.println("No hi ha projectes actuals.");
        } else {
            System.out.println("Projectes actuals:");
            for (Map.Entry<String, ArrayList<Student>> entry : projects.entrySet()) {
                System.out.println("Projecte: " + entry.getKey());
                System.out.println("Membres:");
                for (Student student : entry.getValue()) {
                    System.out.println("  - " + student);
                }
            }
        }
    }

    public boolean removeStudent(String projectName, String studentId) {
        if (!projects.containsKey(projectName)) {
            System.out.println("El projecte '" + projectName + "' no existeix.");
            return false;
        }
        ArrayList<Student> team = projects.get(projectName);
        Student studentToRemove = null;
        for (Student student : team) {
            if (student.getId().equals(studentId)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove == null) {
            System.out.println("L'estudiant amb ID '" + studentId + "' no forma part del projecte '" + projectName + "'.");
            return false;
        }
        team.remove(studentToRemove);
        System.out.println("Estudiant '" + studentToRemove.getName() + "' eliminat del projecte '" + projectName + "'.");
        return true;
    }
}
