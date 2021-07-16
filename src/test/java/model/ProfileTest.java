package model;

import java.awt.EventQueue;

import org.junit.Test;

import profiles.GUI;
import profiles.Profile;
import profiles.Redcapserver;

public class ProfileTest {
	public static void main(String[] args) {
		Redcapserver rserver = new Redcapserver("test");
		rserver.saveMapping();
		rserver.readMapping();

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				GUI m = new GUI();
				m.setVisible(true);
			}
		});

		// rserver.einlesenCSV("C:\\Users\\irina\\Documents\\GitHub\\redcap\\ihCCOntology_Excerpt.csv");
	}

}
