package profiles;

import java.util.HashMap;

public class Profile {
	
	HashMap<String, Mapping> mappings;
	
	public Profile() {
		this.mappings = new HashMap<String, Mapping>();
	}
	
	public void addMapping(Mapping mapping) {
		mappings.put(mapping.getRedCapId(), mapping);
	}
	
	
	public void deleteMapping(Mapping mapping) {
		mappings.remove(mapping);
	}
	
	public Mapping getMapping(String redCapID) {
		Mapping mapping = mappings.get(redCapID);
		
		return mapping;
		
	}

}
