package UAS.UAS_PBO_123;

import javax.swing.JOptionPane;

public class administrasi extends karyawan {
    public String sertifikatKomputer, jamKerja;
    public administrasi(){

    }
    administrasi(String nik, String nama, String alamat, String noP, String sertifikat, String jamkerja) {

        super(nik, nama, alamat, noP);
        this.jamKerja = jamkerja;
        this.sertifikatKomputer = sertifikat;
    }

    public String getSertifikatKomputer() {
        return sertifikatKomputer;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    @Override
    public String toString() {
        return super.toString() + "Sertifikat\t\t\t:" + getSertifikatKomputer() + "\n" + "Jam Kerja\t\t\t:"
                + getJamKerja();
    }

    public void detailKariawan() {
        JOptionPane.showMessageDialog(null, "Berikut Daftar Karyawan Klinik Sejahtera ",
                "Klinik Sejahtera",
                JOptionPane.DEFAULT_OPTION);
        karyawan admin = new administrasi("235314144", "Maria Susianti Lokon",
                "Maguwoharjo ,Krodan, Sleman", "08123904553",
                "Sertifikat FISIOTERAPI",
                "09.00-10.00");
        StringBuffer string = new StringBuffer();
        string.append(admin.toString());
        JOptionPane.showMessageDialog(null, string.toString(), "Klinik Sejahtera", JOptionPane.INFORMATION_MESSAGE);
    }

}
