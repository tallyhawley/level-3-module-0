package IntroToArrayLists;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame;
	JPanel panel;
	JButton addPerson;
	JButton viewNames;
	ArrayList<String> names;
	JTextField input;
	JTextArea name;

	public GuestBook() {
		setupGUI();
	}

	private void setupGUI() {
		names = new ArrayList<String>();
		this.frame = new JFrame("guest book :)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		this.panel = new JPanel();
		panel.setPreferredSize(new Dimension(420, 420));
		this.addPerson = new JButton();
		this.viewNames = new JButton();
		addPerson.setText("add person");
		viewNames.setText("view names");

		panel.setOpaque(true);
		addPerson.setOpaque(true);
		viewNames.setOpaque(true);
		frame.getContentPane().add(panel);
		panel.add(addPerson);
		panel.add(viewNames);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		addPerson.addMouseListener(this);
		viewNames.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addPerson) {
			input = new JTextField(20);
			input.setOpaque(true);
			panel.add(input);
			frame.pack();
			names.add(input.getText());
		} else if (e.getSource() == viewNames) {
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
