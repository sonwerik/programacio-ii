import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public boolean hasPatient(String name) {
        return patients.stream()
                .anyMatch(patient -> patient.getName().equals(name));
    }

    public void removePatient(String name) {
        Patient patientToRemove = patients.stream()
                .filter(patient -> patient.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Pacient no trobat"));
        patients.remove(patientToRemove);
    }

    public Patient getPatientsWithDiagnosis(String diagnosis) {
        return patients.stream()
                .filter(patient -> patient.getDiagnosis().equals(diagnosis))
                .findAny()
                .orElseThrow(() -> new IllegalStateException("No hi ha pacients."));
    }

    public void notifyPatient(String mesage) {
        patients.forEach(patient ->
                System.out.println(mesage));
    }

    public void generatePatientReport() {
        patients.forEach(patient ->
                System.out.println(patient.toString()));
    }
}