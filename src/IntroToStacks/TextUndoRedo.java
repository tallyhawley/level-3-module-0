package IntroToStacks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<String> stack;
	String string = "";
	String character;
	
	public TextUndoRedo() {
		setupGUI();
	}
	
	private void setupGUI() {
		stack = new Stack<String>();
		frame = new JFrame("text");
		panel = new JPanel();
		label = new JLabel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		panel.setPreferredSize(new Dimension(420,420));
		label.setText(string);
		panel.setOpaque(true);
		label.setOpaque(true);
		panel.add(label);
		frame.getContentPane().add(panel);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		label.setFocusable(true);
		label.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		character = String.valueOf(e.getKeyChar());
		string += character;
		label.setText(string);
		frame.pack();
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			stack.push(character);
			if (string != null && string.length() > 0) {
		        string = string.substring(0, string.length() - 1);
		    }
			label.setText(string);
			frame.pack();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SHIFT) {
			string += stack.pop();
			label.setText(string);
			frame.pack();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
