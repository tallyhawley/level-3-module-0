package IntroToHashMaps;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements MouseListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	JFrame frame;
	JPanel panel;
	JButton addEntry;
	JButton searchID;
	JButton viewList;
	JButton removeEntry;
	HashMap<Integer, String> log;
	
	public LogSearch() {
		setupGui();
	}
	
	private void setupGui() {
		log = new HashMap<Integer, String>();
		frame = new JFrame("log search :)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(420,100));
		addEntry = new JButton();
		addEntry.setText("add entry");
		searchID = new JButton();
		searchID.setText("search id");
		viewList = new JButton();
		viewList.setText("view list");
		removeEntry = new JButton();
		removeEntry.setText("remove entry");
		panel.setOpaque(true);
		addEntry.setOpaque(true);
		searchID.setOpaque(true);
		viewList.setOpaque(true);
		removeEntry.setOpaque(true);
		frame.getContentPane().add(panel);
		panel.add(addEntry);
		panel.add(searchID);
		panel.add(viewList);
		panel.add(removeEntry);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		addEntry.addMouseListener(this);
		searchID.addMouseListener(this);
		viewList.addMouseListener(this);
		removeEntry.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addEntry) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("enter an id number"));
			String name = JOptionPane.showInputDialog("enter a name");
			log.put(id, name);
		}
		else if(e.getSource() == searchID) {
			int search = Integer.parseInt(JOptionPane.showInputDialog("enter an id to search"));
			if(log.containsKey(search)) {
				JOptionPane.showMessageDialog(null, "that id belongs to "+log.get(search));
			}else {
				JOptionPane.showMessageDialog(null, "that id doesn't exist. sorry :(");
			}
		}
		else if(e.getSource() == viewList) {
			String all = "";
			for(int s : log.keySet()) {
				String temp = "id: " + s + " -- name: " + log.get(s) + "\n";
				all += temp;
			}
			JOptionPane.showMessageDialog(null, all);
		}
		else if(e.getSource() == removeEntry) {
			int remove = Integer.parseInt(JOptionPane.showInputDialog("enter an id to remove"));
			if(log.containsKey(remove)) {
				log.remove(remove);
				JOptionPane.showMessageDialog(null, "id " + remove + " successfully removed");
			}else {
				JOptionPane.showMessageDialog(null, "that id doesn't exist. sorry :(");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
