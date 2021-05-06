package profiles;

import java.util.HashMap;

//Mapping vom Reader abhängig
//Mapping beeinflusst Redcapserver -> Controller class

public class Redcapserver {
	private Profile profile;
	private ReaderWriter readwrite;
	String nextTime = "";

	public Redcapserver() {
		profile = new Profile();
		einlesen();
	}

	public String addMapping() {
		return nextTime;
	}

	public void removeMapping() {
	}

	public void saveMapping() {
		readwrite.writerJSON();
	}
	
	// Server daten werden eingelesen
	private void einlesen() {
		// methode von ReaderWriter benutzen
		readwrite.readerJSON();
	}
	
	
}
