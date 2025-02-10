import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    public void testAddStudentThrowsExceptionWhenCourseIsFull() {
        Student student1 = new Student("Èrik", 20, 8.7);
        Student student2 = new Student("Victor", 23, 5.8);
        Student student3 = new Student("Melina", 28, 9.7);
        Student student4 = new Student("Serhii", 19, 7.5);
        Course course = new Course("Programació", 3);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        assertEquals(3, course.getStudents().size());
        assertThrows(IllegalStateException.class, () -> course.addStudent(student4));
    }

    @ParameterizedTest
    @CsvSource({
            "90.0, 85.0, 87.5",
            "100.0, 50.0, 75.0",
            "70.0, 80.0, 75.0"
    })
    public void testCalculateAverageGradeReturnsCorrectValue(double grade1, double grade2, double expected) {
        Student student1 = new Student("Student1", 20, grade1);
        Student student2 = new Student("Student2", 23, grade2);
        Course course = new Course("Programació", 25);
        course.addStudent(student1);
        course.addStudent(student2);
        assertEquals(expected, course.calculateAverageGrade());
    }

    @Test
    public void testCalculateAverageGradeThrowsExceptionWhenNoStudents() {
        Course course = new Course("Programació", 25);
        assertThrows(IllegalStateException.class, course::calculateAverageGrade);
    }

    @Test
    public void testFindTopStudentReturnsCorrectStudent() {
        Student student1 = new Student("Èrik", 20, 8.7);
        Student student2 = new Student("Victor", 23, 5.8);
        Student student3 = new Student("Melina", 28, 9.7);
        Student student4 = new Student("Serhii", 19, 7.5);
        Course course = new Course("Programació", 25);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        assertEquals(student3, course.findTopStudent());

    }

    @Test
    public void testFindTopStudentThrowsExceptionWhenNoStudents() {
        Course course = new Course("Programació", 25);
        assertThrows(IllegalStateException.class, course::findTopStudent);
    }

    @Test
    public void testRemoveStudentWorksCorrectly() {
        Student student1 = new Student("Èrik", 20, 8.7);
        Student student2 = new Student("Victor", 23, 6.8);
        Course course = new Course("Programació", 25);
        course.addStudent(student1);
        course.addStudent(student2);
        course.removeStudent("Victor");
        assertEquals(1, course.getStudents().size());
    }

    @Test
    public void testRemoveStudentThrowsExceptionWhenStudentNotFound() {
        Student student1 = new Student("Èrik", 20, 8.7);
        Course course = new Course("Programació", 25);
        course.addStudent(student1);
        course.removeStudent("Èrik");
        assertThrows(IllegalStateException.class, () -> course.removeStudent("Èrik"));
    }

    @Test
    public void testIsStudentEnrolledReturnsTrueIfStudentExists() {
        Student student1 = new Student("Èrik", 20, 8.7);
        Course course = new Course("Programació", 25);
        course.addStudent(student1);
        assertTrue(course.isStudentEnrolled("Èrik"));
    }

    @Test
    public void
    testIsStudentEnrolledReturnsFalseIfStudentDoesNotExist() {
        Course course = new Course("Programació", 25);
        assertFalse(course.isStudentEnrolled("Èrik"));
    }
}