package awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class NewlecFrame extends Frame {

	public NewlecFrame() {
		
		this.addWindowListener(new NewlecWindowsListener());//�������̽�
		setSize(345, 345);
		setBackground(Color.pink);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		g.drawLine(0, 25, 100, 100);

	}


}
