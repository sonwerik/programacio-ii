package POO.Projecte;

import java.util.Arrays;

public class Course {
    private int idCourse;
    private Branch branch; // ADMINISTRATION, MARKETING, IT
    private String[] studies; // "DAM", "ASIX", SMIX...
    private Shift shift; // MORNING, AFTERNOON
    private int course; // 1 = first year, 2 = second year...

    // Enums
    public enum Branch {
        ADMINISTRATION,
        MARKETING,
        IT
    }
 
    public enum Shift {
        MORNING,
        AFTERNOON
    }

    public Course() {
        idCourse = 0;
        studies = new String[]{};
        course = 1;
    }

    public Course(int idCourse, Branch branch, String[] studies, Shift shift, int course) {
        this.idCourse = idCourse;
        this.branch = branch;
        this.studies = studies;
        this.shift = shift;
        this.course = course;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String[] getStudies() {
        return studies;
    }

    public void setStudies(String[] studies) {
        this.studies = studies;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", branch=" + branch +
                ", studies=" + Arrays.toString(studies) +
                ", shift=" + shift +
                ", level=" + course +
                '}';
    }
}