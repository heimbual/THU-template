package profiles;

import java.util.HashMap;

public class Profile {
	
	HashMap<String, Mapping> mappings;
	
	public Profile() {
		this.mappings = new HashMap<String, Mapping>();
	}
	
	public void addMapping(Mapping mapping);
	
	public void deleteMapping(Mapping mapping);
	
	public Mapping getMapping(String redCapID);

}
