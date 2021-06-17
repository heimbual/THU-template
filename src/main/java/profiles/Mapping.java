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
		this.completeID = completeID ;  //funktioniert das so �berhaupt?	
	}
	
	public void trennen(String completeID) {
		String[] result = completeID.split("/",-5);
		  
		  System.out.println("Zero Limit split:");
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
	
	
	public void W�rterzuweisen() {
		//unseren RedCap Server mit dem Ontology Server verbindende W�rterbuch 
		//str1.contains("example")
		//wenn unser Server das Wort beinhaltet und der ontology server das englische Wort hat, 
		// soll mit der methode save die W�rter in der Hashmap zusammenkommen
		
		if (redCapId.contains("alter") & completeID.contains("age")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("gr��e") & completeID.contains("height")) {
			Mapping(redCapId, completeID);
			
		}
		else if(redCapId.contains("gewicht") & completeID.contains("weight")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("anatomical") & completeID.contains("anatomical_reconstructibility")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("ascites") & completeID.contains("ascites_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("cholangitis") & completeID.contains("cholangitis_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("hepatitis_b") & completeID.contains("chronic_hepatitis_b_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("hepatitis_c") & completeID.contains("chronic_hepatitis_c_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("leberzirrhose") & completeID.contains("cirrhosis_observation")) {
			profile.addMapping(null);
		}
		
		else if(redCapId.contains("COPD") & completeID.contains("chronic_obstructive_pulmonary_disease_observe")) {
			Mapping(redCapId, completeID);
		}
		//
		else if(redCapId.contains("Fettleber") & completeID.contains("fatty_liver_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("COPD") & completeID.contains("chronic_obstructive_pulmonary_disease_observe")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("Herzinsuffizienz") & completeID.contains("heart_failure_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("Peritonealkarzinose") & completeID.contains("peritoneal_carcinomatosis_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("portale Hypertonie") & completeID.contains("portal_hypertension_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("Nierenversagen") & completeID.contains("renal_failure_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("Tumorbeobachtung") & completeID.contains("tumor_observation")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("chirurgische Rekonstruierbarkeit (Gallengang)") & completeID.contains("biliary_reconstruction_possible")) {
			Mapping(redCapId, completeID);
		}
		
		else if(redCapId.contains("chirurgische Rekonstruierbarkeit (vaskulär)") & completeID.contains("vascular_reconstruction_possible")) {
			Mapping(redCapId, completeID);
		}
		
		//ASA nicht verstanden
		
		
		/*
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 * else if(redCapId.contains("age") & valueCode.contains("age")) { save(); }
		 */
		
		else if(redCapId.contains(" ")) {
			add(valueCode);
		}
	
	//usw mit allen w�rtern die in Oncology vorhanden sind
}

	private void Mapping(String redCapId2, String completeID2) {
		// TODO Auto-generated method stub
		
	}

	private void add(String AddtoServer) {
		redCapId= AddtoServer;
	}

	private void save() {		
	}
	
}