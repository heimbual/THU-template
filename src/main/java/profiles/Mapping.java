package profiles;
//managen von Daten

public class Mapping {
	
	private String redCapId;
	private String valueSystem;
	private String valueCode;
	private String completeID;
	
	public Mapping(String redCapId, String completeID) {
		// redcap id speichern
// Updated upstream
		// String teilen -> split methode

		
		// String teilen
		
// Stashed changes
		// teile abspeichern
		this.redCapId=redCapId;
		this.completeID = completeID ;  //funktioniert das so �berhaupt?	
	}
	
	
	// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf
	public void split(String completeID) {
		String[] result = completeID.split("/",completeID.lastIndexOf("/"));
		  
			//for (String str2: result){
			   //System.out.println(str2);
			
			
		
		  valueSystem = result[0]; 
		  valueCode = result[1];
		  System.out.println(valueSystem);
		  System.out.println(valueCode);
		  
	}

	
	public enum AdministrativeGender {
        // Male.
           MALE, 
        //Female.
        FEMALE, 
        //Other.
        OTHER, 
        //Unknown.
        UNKNOWN, 
        //added to help the parsers
        NULL;
	}
	
	public String getRedCapId() {
		return redCapId;
	}
	
	public String getCompleteID() {
		return completeID;
	}
	
	public void setCompleteID(String completeID) {
		this.completeID = completeID;
	}

	public void setRedCapId(String redCapId) {
		this.redCapId = redCapId;
	}

	public String getValueSystem() {
		return valueSystem;
	}

	public void setValueSystem(String valueSystem) {
		this.valueSystem = valueSystem;
	}

	public String getValueCode() {
		return valueCode;
	}

	public void setValueCode(String valueCode) {
		this.valueCode = valueCode;
	}
}