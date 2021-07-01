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

	
	private Gson gson;
	private String path;
	private final File jsonfile;
	
	public ReaderWriter(String path) {
		this.gson = new Gson();
		this.path = path;
		this.jsonfile = new File(this.path);
	}
	
	public void readerJSON(Profile profile) {
		try {
			String jsonString = new Gson().toJson(profile);
			System.out.println(jsonString);
			profile = gson.fromJson(new FileReader(getJsonfile()),Profile.class); }
		catch (Exception e) {
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

	public void writerJSON(Profile profile) {
		try {
			String jsonString = new Gson().toJson(profile);
			System.out.println(jsonString);
			FileWriter writer = new FileWriter(getJsonfile());
			gson.toJson(profile, writer);
			writer.flush();
			writer.close();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public File getJsonfile() {
		return this.jsonfile;
	}
}
