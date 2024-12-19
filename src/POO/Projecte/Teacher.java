package POO.Projecte;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher {
    private int idProfessor;
    private String professorName;
    private String professorIdCard;
    private String professorMail;
    private ArrayList<LocalDate> profeessorSchedule;
    private boolean availability;
    private Module modules;

    public Teacher() {
        idProfessor = 0;
        professorName = "Namme";
        professorIdCard = "00000000A";
        professorMail = "example@exemple.com";
        profeessorSchedule = new ArrayList<>();
        availability = false;
        modules = new Module();
    }

    public Teacher(int idProfessor, String professorName, String professorIdCard, String professorMail, ArrayList<LocalDate> profeessorSchedule, boolean availability, Module modules) {
        this.idProfessor = idProfessor;
        this.professorName = professorName;
        this.professorIdCard = professorIdCard;
        this.professorMail = professorMail;
        this.profeessorSchedule = profeessorSchedule;
        this.availability = availability;
        this.modules = modules;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorIdCard() {
        return professorIdCard;
    }

    public void setProfessorIdCard(String professorIdCard) {
        this.professorIdCard = professorIdCard;
    }

    public String getProfessorMail() {
        return professorMail;
    }

    public void setProfessorMail(String professorMail) {
        this.professorMail = professorMail;
    }

    public ArrayList<LocalDate> getProfeessorSchedule() {
        return profeessorSchedule;
    }

    public void setProfeessorSchedule(ArrayList<LocalDate> profeessorSchedule) {
        this.profeessorSchedule = profeessorSchedule;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Module getModules() {
        return modules;
    }

    public void setModules(Module modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "idProfessor=" + idProfessor +
                ", professorName='" + professorName + '\'' +
                ", professorIdCard='" + professorIdCard + '\'' +
                ", professorMail='" + professorMail + '\'' +
                ", profeessorSchedule=" + profeessorSchedule +
                ", availability=" + availability +
                ", modules=" + modules +
                '}';
    }
}
