package swingPackage;


import swingPackage.SwingClass;
import javax.swing.JFrame;


public class SwingMain {

	public static void main(String[] args) {
		//define window and its properties
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Swing Tile Test");
		window.setBounds(100, 100, 600, 800);
		SwingClass panel = new SwingClass();
		window.add(panel);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		panel.startSwingThread();
	}


}
