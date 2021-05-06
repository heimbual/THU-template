package profiles;

//managen von Daten

public class Mapping {

	private String redCapId;
	private String valueSystem;
	private String valueCode;
	
	public Mapping()
	{
		
	}
	
	public Mapping(String redCapId, String valueSystem, String valueCode) {
		this.redCapId = redCapId;
		this.valueSystem = valueSystem;
		this.valueCode = valueCode;
	}
	
	public Mapping(String redCapId, String completeID) {
		// redcap id speichern
		// String teilen
		// teile abspeichern
	}
	
	public enum AdministrativeGender {
        /**
         * Male.
         */
        MALE, 
        /**
         * Female.
         */
        FEMALE, 
        /**
         * Other.
         */
        OTHER, 
        /**
         * Unknown.
         */
        UNKNOWN, 
        /**
         * added to help the parsers
         */
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
