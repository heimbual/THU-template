package profiles;

public class Mapping {

	private String redCapId;
	private String serverId;
	
	public Mapping(String redCapId, String serverId) {
		this.redCapId = redCapId;
		this.serverId = serverId;
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
	
}
