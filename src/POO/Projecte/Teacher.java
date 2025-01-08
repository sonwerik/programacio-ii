package POO.Projecte;

class Teacher {
    private int idTeacher;
    private String teacherName;
    private String teacherMail;
    private boolean availability;

    public Teacher(int idTeacher, String teacherName, String teacherMail) {
        this.idTeacher = idTeacher;
        this.teacherName = teacherName;
        this.teacherMail = teacherMail;
        this.availability = true; // Per defecte està disponible
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherMail() {
        return teacherMail;
    }

    public boolean isAvailability() {
        return availability;
    }
}