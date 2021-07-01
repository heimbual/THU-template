package profiles;


public class Mapping {
	
	private String redCapId;
	private String valueSystem;
	private String valueCode;
	private String completeID;
	
	public Mapping(String redCapId, String completeID) {
	
		this.redCapId=redCapId;
		this.completeID = completeID ;  	
	}
	
	
	public void split(String completeID) {
		String[] result = completeID.split("/",completeID.lastIndexOf("/"));
		  
		  valueSystem = result[0]; 
		  valueCode = result[1];
		  System.out.println(valueSystem);
		  System.out.println(valueCode);
		  
	}

	
	public enum AdministrativeGender {
     
        MALE, 
        FEMALE, 
        OTHER, 
        UNKNOWN, 
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