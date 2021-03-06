package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JMouseActionFrame extends JFrame implements MouseListener {
	private JLabel label = new JLabel("Do something with the mouse");
	String msg  = "";
	
	public JMouseActionFrame() {
		setTitle("Mouse Actions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		addMouseListener(this);
		add(label);
		
	}
	public void mouseClicked(MouseEvent e) {
		int whichButton = e.getButton();
		msg = "You pressed mouse ";
		if(whichButton == MouseEvent.BUTTON1)
			msg += "button 1.";
		else
			if(whichButton == MouseEvent.BUTTON2)
				msg += "button 2.";
			else
				msg += "button 3.";
		
		msg += " You are at position " + e.getX() + ", " + e.getY() + ".";
		
		if(e.getClickCount() == 2)
			msg += " You double-clicked.";
		else
			msg += " You single=clicked.";
		
		label.setText(msg);
		
		
	}
	public void mouseEntered(MouseEvent e) {
		msg = "You entered the frame.";
		label.setText(msg);
	}
	public void mouseExited(MouseEvent e) {
		msg = "You exited the frame.";
		label.setText(msg);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int click = e.getClickCount();
		System.out.println(click);
	}
	
	public static void main(String[] args) {
		JMouseActionFrame mFrame = new JMouseActionFrame();
		final int WIDTH = 750;
		final int HEIGHT = 300;
		mFrame.setSize(WIDTH, HEIGHT);
		mFrame.setVisible(true);
	}
}
