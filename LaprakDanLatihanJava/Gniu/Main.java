import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) {
        File audioFile = new File("C:\\Users\\LENOVO\\Downloads\\Tugas 3_ Maria Yuniarti Mida_");
        AudioInputStream audioInputStream;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(audioFile);

            int fs = (int) audioInputStream.getFormat().getSampleRate();
            int frameSize = audioInputStream.getFormat().getFrameSize();
            int numChannels = audioInputStream.getFormat().getChannels();
            int numFrames = (int) audioInputStream.getFrameLength();

            int N = 500; // Jumlah sampel yang diambil
            byte[] buffer = new byte[N * frameSize];
            audioInputStream.read(buffer);

            double[] y = new double[N];
            for (int i = 0; i < y.length; i++) {
                y[i] = (double) ((buffer[i * frameSize] & 0xFF) | (buffer[i * frameSize + 1] << 8)) / 32768.0;
            }

            double[] t = new double[N];
            for (int i = 0; i < t.length; i++) {
                t[i] = (double) i / fs;
            }

            double[] w = new double[N];
            for (int i = 0; i < w.length; i++) {
                w[i] = 0.5 * (1 - Math.cos(2 * Math.PI / N * i));
            }

            double[] yw = new double[N];
            for (int i = 0; i < yw.length; i++) {
                yw[i] = y[i] * w[i];
            }

            // Kode untuk menampilkan plot yw

        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
