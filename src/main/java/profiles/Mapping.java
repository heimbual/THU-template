package profiles;
//managen von Daten

public class Mapping {
	
	private String redCapId;
	private String valueSystem;
	private String valueCode;
	private String completeID;
	
	public Mapping(String redCapId, String completeID) {
		// redcap id speichern
		// String teilen -> split methode
		// teile abspeichern
		this.redCapId=redCapId;
		this.completeID = completeID ;  //funktioniert das so �berhaupt?	
	}
	
	
	// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/lastIndexOf
	public void split(String completeID) {
		String[] result = completeID.split("/",-5);
		  
			for (String str2: result){
			   System.out.println(str2);
			}
			//hier teilt es alle W�rter einzeln auf, was ich nicht will
			//elegantere L�sung folgt !
		
		  valueSystem = result[0]+"/"+result[1]+"/"+result[2]+"/"+result[3]+"/"+result[4]+"/"; 
		  valueCode = result[5];
		  System.out.println(valueSystem);
		  System.out.println(valueCode);
		  //zu unpraktisch, aber f�r's erste funktioniert's und speichert die Werte ab
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