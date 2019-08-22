import java.awt.FlowLayout ;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class kalkulator_ui {
  JFrame frame = new JFrame ("KALKULATOR");
  JPanel panel = new JPanel (new FlowLayout ());
  JTextArea text = new JTextArea (10,40);
  
  
  JButton tombol20 = new JButton("1");
  JButton tombol12 = new JButton("2");
  JButton tombol13 = new JButton("3");
  JButton tombol14 = new JButton("4");
  JButton tombol15 = new JButton("5");
  JButton tombol16 = new JButton("6");
  JButton tombol17 = new JButton("7");
  JButton tombol18 = new JButton("8");
  JButton tombol19 = new JButton("9");
  JButton tombol10 = new JButton("0");
  
  
  JButton tombolTambah = new  JButton ("+");
  JButton tombolKurang = new JButton ("-");
  JButton tombolKali = new JButton ("*");
  JButton tombolBagi = new JButton ("/");
  
  
  public void ui () {
	  frame.setVisible(true);
	  frame.setSize(340,280);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.add (panel);
	  panel.add(text);
	  panel.add(tombol20);
	  panel.add(tombol12);
	  panel.add(tombol13);
	  panel.add(tombol14);
	  panel.add(tombol15);
	  panel.add(tombol16);
	  panel.add(tombol17);
	  panel.add(tombol18);
	  panel.add(tombol19);
	  panel.add(tombol10);
	  
	  panel.add(tombolTambah);
	  panel.add(tombolKurang);
	  panel.add(tombolKali);
	  panel.add(tombolBagi);

  }
  
  }


  
  
  
