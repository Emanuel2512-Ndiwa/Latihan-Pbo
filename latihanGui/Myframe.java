package latihanGui;

import javax.swing.*;

public class Myframe extends JFrame {
    Myframe(){
  
    this.setTitle("Eman Ndiwa");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(420, 420);
    this.setVisible(true);
    ImageIcon image = new ImageIcon("logo.png");
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new ColorUIResource(123, 50, 25, this.accessibleContext);
    }
}
