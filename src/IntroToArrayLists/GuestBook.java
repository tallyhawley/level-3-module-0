package IntroToArrayLists;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame;
	JLabel panel;
	JButton addPerson;
	JButton viewNames;
	ArrayList<String> names;
	
	public GuestBook() {
		setupGUI();
	}
	
	private void setupGUI() {
		this.frame = new JFrame("guest book :)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		this.panel = new JLabel();
		panel.setPreferredSize(new Dimension(420,420));
		
		this.addPerson = new JButton();
		addPerson.setPreferredSize(new Dimension(50,20));
		this.viewNames = new JButton();
		viewNames.setPreferredSize(new Dimension(50,20));
		panel.setOpaque(true);
		addPerson.setOpaque(true);
		viewNames.setOpaque(true);
		frame.getContentPane().add(panel);
		panel.add(addPerson);
		panel.add(viewNames);
		frame.pack();
		frame.setVisible(true);
	}

}
