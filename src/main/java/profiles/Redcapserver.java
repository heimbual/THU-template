package profiles;

import java.util.HashMap;

//Mapping vom Reader abhängig
//Mapping beeinflusst Redcapserver -> Controller class

public class Redcapserver {
	private Profile profile;
	private ReaderWriter readwrite;

	public Redcapserver(String pfad) {
		profile = new Profile();
		readwrite= new ReaderWriter(pfad);
		//einlesen();
	}
	
	public Redcapserver() {
		profile = new Profile();
		readwrite= new ReaderWriter("*\test.json");
		//einlesen();
	}

	//public String addMapping() {
	//	return nextTime;
	//}

	public void removeMapping() {
	}

	public void saveMapping() {
		readwrite.writerJSON(profile);
	}
	
	// Server daten werden eingelesen
	private void einlesen() {
		// methode von ReaderWriter benutzen
		readwrite.readerJSON(profile);
	}
	
	public void einlesenCSV(String pfad) {
		// methode von ReaderWriter benutzen
		readwrite.readerCSV(pfad);
	}
	
}
