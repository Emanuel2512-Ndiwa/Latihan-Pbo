package modul_09;

import javax.swing.*;

public class mainKelas {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Portal Perusahaan Pertamina");

        JOptionPane.showConfirmDialog(null, "Apakah Ingin Melanjutkan");
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pegawai"));
        pegawai[] pega = new pegawai[jumlah];
        int npp;
        String nama, status;
        double gaji;
        for (int i = 0; i < pega.length; i++) {

            npp = Integer.parseInt(JOptionPane.showInputDialog("Masukan Npp"));
            nama = JOptionPane.showInputDialog("Masukan Nama");
            gaji = Double.parseDouble(JOptionPane.showInputDialog("Masukan Gaji Pokok"));
            do {
                status = JOptionPane.showInputDialog("Status Anda Manager,Honor,Pemasaran");
                if (!status.equalsIgnoreCase("Manager") && !status.equalsIgnoreCase("Honor")
                        && !status.equalsIgnoreCase("Pemasaran")) {
                    JOptionPane.showMessageDialog(null, "Anda Salah Input Status");
                }
            } while (!status.equalsIgnoreCase("Manager") && !status.equalsIgnoreCase("Honor")
                    && !status.equalsIgnoreCase("Pemasaran"));
            if (status.equalsIgnoreCase("Manager")) {
                pega[i] = new manajer();
            } else if (status.equalsIgnoreCase("Pemasaran")) {
                pega[i] = new pemasaran();
            } else if (status.equalsIgnoreCase("Honor")) {
                pega[i] = new honor();
            }

            pega[i].setNpp(npp);
            pega[i].setNama(nama);
            pega[i].setGajiPokok(gaji);

            if (pega[i] instanceof manajer) {
                manajer m;
                m = (manajer) pega[i];
                double t = Double.parseDouble(JOptionPane.showInputDialog("Masukan Tunjangan jabatan"));
                m.setTunJab(t);
                double l = Double.parseDouble(JOptionPane.showInputDialog("Jumlah Hari Lembur"));
                m.setLembur(l);
            } else if (pega[i] instanceof pemasaran) {
                pemasaran p;
                p = (pemasaran) pega[i];
                double b = Double.parseDouble(JOptionPane.showInputDialog("Bonus Gaji Anda"));
                p.setBonus(b);
            } else if (pega[i] instanceof honor) {
                honor h;
                h = (honor) pega[i];
                double l = Double.parseDouble(JOptionPane.showInputDialog("Jumlah Lembur Yang Anda Kerjakan"));
                h.setLembur(l);
            }

        }
        for (int i = 0; i < pega.length; i++) {

            JOptionPane.showMessageDialog(null, "Data Pegawai \tke -" + (i + 1) + "\n" +
                    "NPP            \t: " + pega[i].getNpp() + "\n" +
                    "Nama           \t: " + pega[i].getNama() + "\n" +
                    "Status         \t: " + pega[i].getStatus() + "\n" +
                    "Gaji Pokok     \t: " + pega[i].getGajiPokok() + "\n" +
                    "Tunjangan      \t: " + pega[i].getTunjangan() + "\n" +
                    "Gaji Total     \t: " + pega[i].hitungGaTot());

            if (pega[i].getStatus() == "Manajer") {
                manajer m = new manajer();
                JOptionPane.showMessageDialog(null,"Email Manajer\t:"+m.getEmail());

            }else if(pega[i].getStatus() == "Honor"){
                honor h = new honor(); 
                JOptionPane.showMessageDialog(null,"Email Honor\t:"+h.getEmail());

            }else if(pega[i].getStatus() == "Pemasaran"){
                pemasaran p = new pemasaran();
                JOptionPane.showMessageDialog(null,"Email Pemasaran\t:"+p.getEmail());

            }
        }

    }

}
