package pack1;

import javax.swing.JFrame;

public class Cars extends JFrame {
	
	public static void main (String[] ags) {
		JFrame app=new JFrame();
		work w=new work();
		app.add(w);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(500,720);
		app.setVisible(true);
	}

}
