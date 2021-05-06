package profiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ReaderWriter {

	
	//use jsonnode, jsonparser etc...
	private Gson gson;
	private String pfad;
	private final File jsonfile;
	
	public ReaderWriter(String pfad) {
		this.gson = new Gson();
		this.pfad=pfad;
		this.jsonfile = new File(this.pfad);
	}

	
	public void readerJSON() {
		// how to get the parameters? saving in class mapping?
		try {
			Profile profile = gson.fromJson(new FileReader(jsonfile),Profile.class);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// String filePath = new File("").getAbsolutePath() + File.separator +
	// "/src/ihccOntology_Excerpt.csv";
	public void readerCSV(String filePath) {
		try {
			String line = "";
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				for (int i = 0; i < data.length; i++)
					System.out.print(data[i] + " ");
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	// save mapping
	public void writerJSON(Profile profile) {
		try {
			gson.toJson(profile, new FileWriter(jsonfile));
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
