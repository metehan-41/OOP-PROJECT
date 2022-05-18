package pack1;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class work extends JPanel implements ActionListener {
	
	private int space;
	private int speed;
	private int WIDTH=500;
	private int HEIGHT=700;
	public work() {
		space=100;
		speed=2;
	}
	public void paintComponent (Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.green);
		g.fillRect(0,0,WIDTH,HEIGHT);
		g.setColor(Color.gray);
		g.fillRect(WIDTH/2-100,0,200,HEIGHT);
	    
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
