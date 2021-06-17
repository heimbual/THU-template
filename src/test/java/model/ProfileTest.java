package model;

import org.junit.Test;

import profiles.Profile;
import profiles.Redcapserver;

public class ProfileTest {
	public static void main(String[] args) {
		Redcapserver rserver= new Redcapserver();
		//rserver.einlesenCSV("C:\\Users\\irina\\Documents\\GitHub\\redcap\\ihCCOntology_Excerpt.csv");
		rserver.saveMapping();
	}
	
}
