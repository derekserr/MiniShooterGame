import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Main extends second {
	public static void main(String[] args) {
	second s =new second();
	JFrame window= new JFrame();
	
	
	
	JLabel label1 = new JLabel("");
	label1.setFont(new Font("Monospaced", Font.PLAIN, 15));
	label1.setForeground(Color.GREEN);
	label1.setText("Welcome to Derek's First Game! Press Enter to get started!!");
	label1.setBounds(8,1,600,55);
	window.add(label1);
	
	
	
	JLabel label2 = new JLabel("");
	label2.setFont(new Font("Monospaced", Font.PLAIN, 15));
	label2.setText("Welcome to Derekl's First Game! Press Enter to get started!!");
	label2.setBounds(8,8,600,55);
	window.add(label2);
	
	
	
	JLabel label3 = new JLabel("");
	label3.setForeground(Color.GREEN);
	label3.setFont(new Font("Monospaced", Font.PLAIN, 15));
	label3.setText("Use the arrow keys to move around, and the space bars to shoot.the Green Blobs are your enemy!");
	label3.setBounds(8,60,600,55);
	window.add(label3);
	
	
	
	JLabel label4 = new JLabel("");
	label4.setForeground(Color.GREEN);
	label4.setFont(new Font("Monospaced", Font.PLAIN, 15));
	label4.setText("Green Blobs are your enemy! Press 'Enter' to bring them back");
	label4.setBounds(8,180,600,55);
	window.add(label4);
	

	
/*	JLabel ammo = new JLabel("");
	ammo.setForeground(Color.GREEN);
	ammo.setFont(new Font("Monospaced", Font.PLAIN, 15));
	ammo.setText("hi");
	ammo.setBounds(8,1,600,55);
	window.add(ammo);*/
	
	
	
	window.add(s);
	window.setVisible(true);
	window.setSize(600,400);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setTitle("Random Game");
	
}
}
