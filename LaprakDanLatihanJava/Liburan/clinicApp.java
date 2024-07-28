package Liburan;

import javax.swing.JOptionPane;

public class clinicApp {
    public static void main(String[] args) {
        clinic clinic = new clinic();
        boolean running = true;
        while (running) {

            String[] options = { "Tambah Pasien", "Cari Pasien", "Keluar" };
            int choice = JOptionPane.showOptionDialog(null, "Pilih Opsi", "Klinik App", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    String name = JOptionPane.showInputDialog("Masukan Nama");
                    String ageStr = JOptionPane.showInputDialog("Masukan Umur Pasien");
                    int age = Integer.parseInt(ageStr);
                    String complaint = JOptionPane.showInputDialog("Masukan Keluhan Pasien");
                    Patient newPatient = new Patient(name, age, complaint);
                    clinic.addPatient(newPatient);
                    break;

                case 1: // Cari Pasien
                    String searchName = JOptionPane.showInputDialog(null, "Masukkan nama pasien yang dicari:");
                    Patient foundPatient = clinic.searchPatientByName(searchName);

                    if (foundPatient != null) {
                        foundPatient.displayinfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Pasien tidak ditemukan.", "Hasil Pencarian",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case 2: // Keluar
                    running = false;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan aplikasi Klinik.");
    }
}
