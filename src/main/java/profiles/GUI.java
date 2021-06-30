package profiles;

import profiles.Redcapserver;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame {
	File file;
	Profile profile;
	
	public GUI(){
		// GUI
		setTitle("Parameter mit entsprechenden IRI");
		setSize(720,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		profile = new Profile();
		// Layout
		Container pane = getContentPane();
		
		pane.setLayout(new FlowLayout());
		
	
		Object[][] data = new Object[][]{profile.mappings.keySet().toArray(), profile.mappings.entrySet().toArray()};
		for(int i = 0; i < data.length;i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.println(data[i][j] + " ");
			}
		}
		String[] colNames = {"Parameter", "Zugehöriger Link"};
		JTable tabelle = new JTable(data, colNames);
		pane.add(new JScrollPane(tabelle));

		
		// Buttons
		JButton upload = new JButton("Datei Auswählen");
		
		upload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser = new JFileChooser();
				int dialog = filechooser.showDialog(getContentPane(), "Datei öffnen");
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