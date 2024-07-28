package Liburan;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class clinic implements PatientManager {
    private List<Patient> Patients;

    public clinic() {
        Patients = new ArrayList<>();
    }

    @Override
    public void addPatient(Patient patient) {
        Patients.add(patient);
        JOptionPane.showMessageDialog(null, "Data Pasien Telah Disimpan", "Konfirmasi",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public Patient searchPatientByName(String name) {
        for (Patient patient : Patients) {
            if (patient.getNama().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;

    }

    public List<Patient> gPatients() {
        return Patients;

    }

}
