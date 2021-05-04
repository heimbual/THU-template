package profiles;

import java.util.HashMap;

//Mapping vom Reader abhängig
//Mapping beeinflusst Redcapserver -> Controller class

public class Redcapserver {
	private Mapping mapping;
	private ReaderWriter readwrit;
	String nextTime = "";

	public Redcapserver() {
		mapping = new Mapping();
		einlesen();
	}

	public String addMapping() {
		return nextTime;
	}

	public void removeMapping() {
	}

	public void saveMapping() {
		readwrit.writerJSON();
	}
	
	// Server daten werden eingelesen
	private void einlesen() {
		// methode von ReaderWriter benutzen
		readwrit.readerJSON();
	}
	
	
}
