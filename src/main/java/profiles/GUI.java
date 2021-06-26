package profiles;

import profiles.Redcapserver;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

import profiles.Profile;
import profiles.Mapping;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {
	File file;
	
	public GUI(){
		// GUI
		setTitle("Parameter mit entsprechenden IRI");
		setSize(440,250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Layout
		Container pane = getContentPane();
		pane.setLayout(null);
		
		// Buttons
		JButton upload = new JButton("Datei Ausw�hlen");
		
		upload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser = new JFileChooser();
				int dialog = filechooser.showDialog(getContentPane(), "Datei �ffnen");
				FileFilter filter = new FileNameExtensionFilter("json", "csv");
				if (dialog == JFileChooser.APPROVE_OPTION)
				{
					file = filechooser.getSelectedFile();
				}
			}
		});
		upload.setBounds(30,100,180,20);
		pane.add(upload);
		
		JButton save = new JButton("Datei Speichern");
		save.setBounds(220,100,180,20);
		pane.add(save);
		
		
		JButton abrechen = new JButton("Abrechen");
		abrechen.setBounds(150,150,120,20);
		pane.add(abrechen);
		abrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
	}

	 public static void main(String[] args) {
		 
		 
		 EventQueue.invokeLater(new Runnable(){
		 
		 public void run() {
			 GUI m = new GUI();
			 m.setVisible(true);
		 }
		 });
	 }

	public File getFile() {
		return file;
	}
}
		 
		 
	 
		 
	 
	 

	 
	 

