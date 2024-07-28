package lathihanobjectarray;
import javax.swing.*;
public class main_mobil {
    public static void main(String[] args) {

        mobil[] input;

        input=new mobil[5];
        String merk,warna;

        for(int a=0; a < input.length;a++){
            merk=JOptionPane.showInputDialog(null,"Masukan Merk\t:");
            warna=JOptionPane.showInputDialog(null,"Masukan Warna Mobil Anda\t:");


            input[a]=new mobil(merk, warna);
            input[a].setMerk(merk);
            input[a].setWarna(warna);
           
        }
        // // Menampilkan merek dan warna mobil yang tersimpan di dalam array menggunakan JOptionPane
        // StringBuilder output = new StringBuilder();
        // for (int i = 0; i < input.length; i++) {
        //     output.append("Merek Mobil ke-").append(i + 1).append(": ").append(input[i].getMerk()).append("\n");
        //     output.append("Warna Mobil ke-").append(i + 1).append(": ").append(input[i].getWarna()).append("\n\n");
        // }

        // JOptionPane.showMessageDialog(null, output.toString());
        // Menampilkan merek dan warna mobil yang tersimpan di dalam array menggunakan JOptionPane
        for (int i = 0; i < input.length; i++) {
            JOptionPane.showMessageDialog(null, "Merek Mobil ke-" + (i + 1) + ": " + input[i].getMerk() +
                    "\nWarna Mobil ke-" + (i + 1) + ": " + input[i].getWarna());
        }
        
        
    }

}
