package profiles;

import java.util.HashMap;

public class Profile {
	
	HashMap<String, Mapping> mappings;
	
	public Profile() {
		this.mappings = new HashMap<String, Mapping>();
		initializeProfile();
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
	
	private void initializeProfile() {
		mappings.put("record_id ", new Mapping("record_id ", "meineGlobaleID"));
		mappings.put("gender", new Mapping("gender", "http://sfb125.de/ontology/factorontology/gender"));
		mappings.put("hepatitis_b ", new Mapping("hepatitis_b ", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_hepatitis_b_observation"));
		mappings.put("bilirubin_concentration", new Mapping("bilirubin_concentration", "http://sfb125.de/ontology/ihCCApplicationOntology/bilirubin_concentration"));
	
		//Fortsetzung folgt 
		mappings.put("MeineRedCapID", new Mapping("MeineRedcApID", "meineGlobaleID"));
		mappings.put("MeineRedCapID", new Mapping("MeineRedcApID", "meineGlobaleID"));
	}
}
