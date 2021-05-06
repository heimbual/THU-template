package profiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderWriter {

	
	public ReaderWriter() {

	}

	//parameter einlesen
	public void readerJSON() {
		//beim einlesen in Mapping speichern?
	}
	
	//String filePath = new File("").getAbsolutePath() + File.separator + "/src/ihccOntology_Excerpt.csv";
	public void readerCSV(String filePath) { 
		try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                for(int i = 0; i<data.length; i++)
                    System.out.print(data[i] + " ");
                System.out.println("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e) {
             e.printStackTrace();
        }
    }
		
	

	//Mapping speichern
	public void writerJSON() {

	}
}
