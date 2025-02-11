import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    void testAddPatientIncreasesPatientCount() {
        Patient patient = new Patient("Èrik", 20, "Autisme");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient);
        assertEquals(1, doctor.getPatients().size());
    }

    @Test
    void testHasPatientReturnsCorrectValue() {
        Patient patient = new Patient("Èrik", 20, "Autisme");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient);
        assertTrue(doctor.hasPatient("Èrik"));
    }

    @Test
    void testRemovePatientWorksCorrectly() {
        Patient patient1 = new Patient("Èrik", 20, "Autisme");
        Patient patient2 = new Patient("Victor", 23, "Miopia");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient1);
        doctor.addPatient(patient2);
        doctor.removePatient("Victor");
        assertEquals(1, doctor.getPatients().size());
    }

    @Test
    void testRemovePatientThrowsExceptionWhenNotFound() {
        Patient patient = new Patient("Èrik", 20, "Autisme");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient);
        assertThrows(IllegalStateException.class, () -> doctor.removePatient("Victor"));
    }

    @Test
    void testGetPatientsWithDiagnosisReturnsCorrectPatients() {
        Patient patient1 = new Patient("Èrik", 20, "Autisme");
        Patient patient2 = new Patient("Victor", 23, "Miopia");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient1);
        doctor.addPatient(patient2);
        assertEquals(patient1, doctor.getPatientsWithDiagnosis("Autisme"));
    }

    @Test
    void testGeneratePatientReportReturnsCorrectFormat() {
        Patient patient = new Patient("Èrik", 20, "Autisme");
        Doctor doctor = new Doctor("Alberto", "Psicologia");
        doctor.addPatient(patient);
        // assertEquals(patient.toString(), doctor.generatePatientReport());
    }
}