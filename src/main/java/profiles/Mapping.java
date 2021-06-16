package profiles;
//managen von Daten

public class Mapping {
	
	Profile profile= new Profile();
	private String redCapId;
	private String valueSystem;
	private String valueCode;
	private String completeID;
	
	
	public Mapping(String redCapId, String valueSystem, String valueCode) {
		this.redCapId = redCapId;
		this.valueSystem = valueSystem;
		this.valueCode = valueCode;
	}
	
	public Mapping(String redCapId, String completeID) {
		// redcap id speichern
		// String teilen
		// teile abspeichern
		this.redCapId=redCapId;
		this.completeID = completeID ;  //funktioniert das so überhaupt?	
	}
	
	public void trennen(String completeID) {
		String[] result = completeID.split("/",-5);
		  
		  System.out.println("Zero Limit split:");
			for (String str2: result){
			   System.out.println(str2);
			}
			//hier teilt es alle Wörter einzeln auf, was ich nicht will
			//elegantere Lösung folgt !
		
		  valueSystem = result[0]+"/"+result[1]+"/"+result[2]+"/"+result[3]+"/"+result[4]+"/"; 
		  valueCode = result[5];
		  System.out.println(valueSystem);
		  System.out.println(valueCode);
		  //zu unpraktisch, aber für's erste funktioniert's und speichert die Werte ab
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
	
	
	public void Wörterzuweisen() {
		//unseren RedCap Server mit dem Ontology Server verbindende Wörterbuch 
		//str1.contains("example")
		//wenn unser Server das Wort beinhaltet und der ontology server das englische Wort hat, 
		// soll mit der methode save die Wörter in der Hashmap zusammenkommen
		
		if (redCapId.contains("alter") & valueCode.contains("age")) {
			  save();
		}
		
		else if(redCapId.contains("größe") & valueCode.contains("height")) {
			redCapId = valueCode;
			
		}
		else if(redCapId.contains("gewicht") & valueCode.contains("weight")) {
			save();
		}
		
		else if(redCapId.contains("anatomical") & valueCode.contains("anatomical_reconstructibility")) {
			save();
		}
		
		else if(redCapId.contains("ascites") & valueCode.contains("ascites_observation")) {
			save();
		}
		
		else if(redCapId.contains("cholangitis") & valueCode.contains("cholangitis_observation")) {
			save();
		}
		
		else if(redCapId.contains("hepatitis_b") & valueCode.contains("chronic_hepatitis_b_observation")) {
			save();
		}
		
		else if(redCapId.contains("hepatitis_c") & valueCode.contains("chronic_hepatitis_c_observation")) {
			save();
		}
		
		else if(redCapId.contains("leberzirrhose") & valueCode.contains("cirrhosis_observation")) {
			profile.addMapping(null);
		}
		
		else if(redCapId.contains("COPD") & valueCode.contains("chronic_obstructive_pulmonary_disease_observe")) {
			save();
		}
		
		/*
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 */
		
		else if(redCapId.contains(" ")) {
			add(valueCode);
		}
	
	//usw mit allen wörtern die in Oncology vorhanden sind
}

	private void add(String AddtoServer) {
		redCapId= AddtoServer;
	}

	private void save() {		
	}
	
}