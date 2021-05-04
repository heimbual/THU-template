package profiles;


//managen von Daten

public class Mapping {

	private String redCapId;
	private String serverId;
	
	public Mapping()
	{
		
	}
	
	public Mapping(String redCapId, String serverId_lokal, String serverId_global) {
		this.redCapId = redCapId;
		this.redCapId = serverId;
		//this.serverId = MALE;
	}
	
	public String getRedCapId() {
		return redCapId;
	}

	public void setRedCapId(String redCapId) {
		this.redCapId = redCapId;
	}

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
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
}
