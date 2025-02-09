package Collections.HashMap.Ex3;

import java.util.*;

class CourseManager {
    private HashMap<String, Student> students;

    public CourseManager() {
        students = new HashMap<>();
    }

    public void enrollStudent(Student student) {
        if (!students.containsKey(student.getIdStudent())) {
            students.put(student.getIdStudent(), student);
            System.out.println("Estudiant inscrit: " + student);
        } else {
            System.out.println("Error: L'estudiant amb ID " + student.getIdStudent() + " ja està inscrit.");
        }
    }

    public void unenrollStudent(String id) {
        if (students.containsKey(id)) {
            Student removedStudent = students.remove(id);
            System.out.println("Estudiant desinscrit: " + removedStudent);
        } else {
            System.out.println("Error: No s'ha trobat l'estudiant amb ID " + id);
        }
    }

    public void findStudentById(String id) {
        if (students.containsKey(id)) {
            System.out.println("Estudiant trobat: " + students.get(id));
        } else {
            System.out.println("Error: No s'ha trobat l'estudiant amb ID " + id);
        }
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No hi ha cap estudiant inscrit al curs.");
        } else {
            System.out.println("\nEstudiants inscrits:");
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}
