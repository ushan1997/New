package CarGame;

import javax.swing.JFrame;

public class Cars extends JFrame {

	public static void main(String args[]) {
		
		JFrame app=new JFrame();
		works w= new works();
		app.add(w);
		app.setDefaultCloseOperation(app.EXIT_ON_CLOSE);
		app.setSize(500,700);
		app.setVisible(true);
	}
	
}
