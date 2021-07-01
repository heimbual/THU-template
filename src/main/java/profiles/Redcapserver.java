package profiles;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;


public class Redcapserver {
	private Profile profile;
	private ReaderWriter readwrite;

	public Redcapserver(String filename) {
		profile = new Profile();
		readwrite = new ReaderWriter("./" + filename + ".json");
	}

	public void initializeFilePath(File jsonfile) {
		 try {
			 Runtime.getRuntime().exec("explorer.exe  /select," + jsonfile.getAbsolutePath()); } 
		 catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void saveMapping() {
		readwrite.writerJSON(profile);
	}

	public void readMapping() {
		readwrite.readerJSON(profile);
	}

	public void readMappingCSV(String pfad) {
		readwrite.readerCSV(pfad);
	}

}
