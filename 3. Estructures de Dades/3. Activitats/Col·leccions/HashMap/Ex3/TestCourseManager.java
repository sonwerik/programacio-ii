package Collections.HashMap.Ex3;

public class TestCourseManager {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();

        Student student1 = new Student("A001", "Joan Pérez", 20);
        Student student2 = new Student("A002", "Maria García", 22);
        Student student3 = new Student("A003", "Lluís Rodríguez", 21);
        Student student4 = new Student("A004", "Anna Sánchez", 23);
        Student student5 = new Student("A005", "Carlos Fernández", 24);

        courseManager.enrollStudent(student1);
        courseManager.enrollStudent(student2);
        courseManager.enrollStudent(student3);
        courseManager.enrollStudent(student4);
        courseManager.enrollStudent(student5);

        courseManager.enrollStudent(student1);

        System.out.println("\nCercant estudiant amb ID 'A003':");
        courseManager.findStudentById("A003");

        System.out.println("\nDesinscrivint l'estudiant amb ID 'A002':");
        courseManager.unenrollStudent("A002");

        courseManager.listAllStudents();

        System.out.println("\nIntentant desinscriure l'estudiant amb ID 'A010':");
        courseManager.unenrollStudent("A010");
    }
}

