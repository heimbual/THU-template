package profiles;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;

import profiles.Profile;
import profiles.Mapping;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	 public static void main(String[] args) {
		 
		 JComboBox comboBoxListe;
		 //JTextField linkAusgeben;
		 
	        JFrame meinJFrame = new JFrame();
	        meinJFrame.setTitle("Parameter mit entsprechenden IRI");
	        meinJFrame.setSize(300, 300);
	        JPanel panel = new JPanel();
	 
	        JLabel frage = new JLabel("Wähle einen Parameter: ");
	        panel.add(frage);
	 
	       
	        String comboBoxListe1[] = {"Age", "Height",
	            "Weight", "Anatomical Reconstructibility", "Ascites",
	            "Cholangitis", "Chronic Hepatitis B", "Chronic Hepatitis C",
	            "Cirrhosis", "COPD", "Fatty Liver",
	            "Heart Failure", "Peritoneal Carcinomatosis", "Portal Hypertension",
	            "Renal Failure", "Tumor Observation"}; // usw..
	 
	        // Erstellung der Jcomobox mit den Parameter Einträgen
	               
	        JComboBox ParameterAuswahl = new JComboBox(comboBoxListe1);
	 
	   
	        
	        //JComboBox wird Panel hinzugefügt
	        panel.add(ParameterAuswahl);
	 
	        meinJFrame.add(panel);
	        meinJFrame.setVisible(true);
	        
	        //******************************************//
	        
//	        JTextField linkAusgeben = new JTextField();
//	        if ()
//	        panel.add(linkAusgeben);
//	        meinJFrame.add(panel);
//	        meinJFrame.setVisible(true);
	        
	        
	        //Erstellung eines Textfeldes zur Ausgabe des Links
	       // JPanel p = new JPanel();
	       // p.setSize(1000, 500);
	      //  JTextField linkAusgeben = new JTextField();
	      //  p.add(linkAusgeben);
	     
	      //  String text = "";
	      //  for (Iterator i = keys.iterator(); i.hasNext();) {
	      //  String redCapId = (String) i.next();
	      //  String valueCode = (String) map.get(key);
	       // text+=key + "=" + valueCode;
	        //}
	        
	        //	linkAusgeben.setText(text); 
	        
//	     	JTextField linkAusgeben = new JTextField();
//	        String s;
//	        Map hash_map;
//			for (Map.Entry<String, String> set : hash_map.entrySet()) {
//	        System.out.println(set.getKey() + " = " + set.getValue());
//	        If (set.getKey()== redCapId){
//	        S = s+ set.getValue() + „ „;
//	        }
//	        }
//	        linkAusgeben.setText(s);
//	        panel.add(linkAusgeben);
//	        meinJFrame.add(panel);
//	        meinJFrame.setVisible(true);


	 
	    	        
	        //mappings.put("gender", new Mapping("gender", "http://sfb125.de/ontology/factorontology/gender"));
}
}