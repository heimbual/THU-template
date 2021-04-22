package profiles;

import java.util.HashMap;

public class HardcodeReader {

	private HashMap<String, String> hashmap;
	private Mapping mapping;
	
	class Profile{
	
	private HashMap<String, String> hashmap;
		
	//public String get_global_id(String redcapID);
	//public String get_local_id(String redcapID);
	
	}
	
	public HardcodeReader() {
		hashmap = new HashMap<String, String>();
		mapping = new Mapping("hepatitis_b", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_hepatitis_b_observation");
		hashmap.put(mapping.getRedCapId(), mapping.getServerId());
		//hashmap.put("hepatitis_b", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_hepatitis_b_observation");
		hashmap.put("hepatitis_c", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_hepatitis_c_observation");
		hashmap.put("bilirubin_concentration",
				"http://sfb125.de/ontology/ihCCApplicationOntology/bilirubin_concentration");
		
		
	}

	public void outputLink(String keyword) {
		System.out.println("Der Link zum Schlüsselwort: " + keyword + " Der Link:  " + hashmap.get(keyword).toString());
	}

}