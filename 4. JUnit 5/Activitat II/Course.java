import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Course {
    private String title;
    private int maxStudents;
    private List<Student> students;

    public Course(String title, int maxStudents) {
        this.title = title;
        this.maxStudents = maxStudents;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (students.size() >= maxStudents) {
            throw new IllegalStateException("The course is full.");
        }
        students.add(student);
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students in the course.");
        }
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.size();
    }

    public Student findTopStudent() {
        return students.stream()
                .max(Comparator.comparingDouble(Student::getGrade))
                .orElseThrow(() -> new IllegalStateException("No hi ha estudiants."));
    }

    public void removeStudent(String name) {
        Student studentToRemove = students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Estudiant no trobat"));

        students.remove(studentToRemove);
    }

    public boolean isStudentEnrolled(String name) {
        return students.stream().anyMatch(student ->
                student.getName().equals(name));
    }
}