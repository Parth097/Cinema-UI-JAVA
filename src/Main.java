import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// calling the GUI class and setting the window.

		GUI window = new GUI();
		window.setVisible(true);
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}