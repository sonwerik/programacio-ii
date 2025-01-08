package POO.Projecte;

import java.time.LocalDate;
import java.time.LocalTime;

class Book {
    private LocalDate date;
    private LocalTime time;
    private Teacher teacher;
    private Student student;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Data: " + date + ", Hora: " + time + ", Professor: " + teacher.getTeacherName() + ", Estudiant: " + student;
    }
}