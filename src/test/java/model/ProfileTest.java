package model;

import org.junit.Test;

import profiles.Profile;
import profiles.Redcapserver;

public class ProfileTest {
	public static void main(String[] args) {
		Redcapserver rserver = new Redcapserver("test");
		rserver.saveMapping();
		rserver.readMapping();
		
		
		// rserver.einlesenCSV("C:\\Users\\irina\\Documents\\GitHub\\redcap\\ihCCOntology_Excerpt.csv");
	}

}
