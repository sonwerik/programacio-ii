package POO.ProjecteNadal;

class Appointment {
    private String date;
    private String time;
    private Professor professor;
    private String room;

    public Appointment(String date, String time, Professor professor, String room) {
        this.date = date;
        this.time = time;
        this.professor = professor;
        this.room = room;
    }

    public String getDetails() {
        return "Cita el " + date + " a les " + time + " amb el professor " + professor.getFullName() + " a l'aula " + room;
    }
}
