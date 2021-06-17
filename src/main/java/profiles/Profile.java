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
		
		mappings.put("ALBI score", new Mapping("ALBI score", "http://sfb125.de/ontology/ihCCApplicationOntology/albi_score"));
		mappings.put("BMI", new Mapping("BMI", "http://sfb125.de/ontology/ihCCApplicationOntology/body_mass_index"));
		mappings.put("age", new Mapping("age", "http://sfb125.de/ontology/factorontology/age"));
		mappings.put("height", new Mapping("height", "http://sfb125.de/ontology/factorontology/height"));	
		mappings.put("weight", new Mapping("weight", "http://sfb125.de/ontology/factorontology/weight"));
		mappings.put("Anatomical Reconstructibility ", new Mapping("Anatomical Reconstructibility ", "http://sfb125.de/ontology/ihCCApplicationOntology/anatomical_reconstructibility"));
		mappings.put("Ascites ", new Mapping("Ascites ", "http://sfb125.de/ontology/ihCCApplicationOntology/ascites_observation"));
		mappings.put("Cholangitis ", new Mapping("Cholangitis ", "http://sfb125.de/ontology/ihCCApplicationOntology/cholangitis_observation"));
		mappings.put("hepatitis_c", new Mapping("hepatitis_c", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_hepatitis_b_observation"));
		mappings.put("cirrhosis", new Mapping("cirrhosis", "http://sfb125.de/ontology/ihCCApplicationOntology/cirrhosis_observation"));
		mappings.put("copd", new Mapping("copd", "http://sfb125.de/ontology/ihCCApplicationOntology/chronic_obstructive_pulmonary_disease_observation"));
		mappings.put("fatty_liver", new Mapping("fatty_liver", "http://sfb125.de/ontology/ihCCApplicationOntology/fatty_liver_observation"));
		mappings.put("heart_failure", new Mapping("heart_failure", "http://sfb125.de/ontology/ihCCApplicationOntology/heart_failure_observation"));
		mappings.put("peritoneal_carcinomatosis", new Mapping("peritoneal_carcinomatosis", "http://sfb125.de/ontology/ihCCApplicationOntology/peritoneal_carcinomatosis_observation"));
		mappings.put("portal_hypertension", new Mapping("portal_hypertension", "http://sfb125.de/ontology/ihCCApplicationOntology/portal_hypertension_observation"));
		mappings.put("renal_failure", new Mapping("renal_failure", "http://sfb125.de/ontology/ihCCApplicationOntology/renal_failure_observation"));
		mappings.put("tumor_observation", new Mapping("tumor_observation", "http://sfb125.de/ontology/ihCCApplicationOntology/renal_failure_observation"));
		mappings.put("Surgical Reconstructibility (biliary)", new Mapping("Surgical Reconstructibility (biliary)", "http://sfb125.de/ontology/ihCCApplicationOntology/biliary_reconstruction_possible"));
		mappings.put("Surgical Reconstructibility (vascular)", new Mapping("Surgical Reconstructibility (vascular)", "http://sfb125.de/ontology/ihCCApplicationOntology/vascular_reconstruction_possible"));
		mappings.put("ASA", new Mapping("ASA", "http://sfb125.de/ontology/ihCCApplicationOntology/ASA"));
		mappings.put("Ascites Severity", new Mapping("Ascites Severity", "http://sfb125.de/ontology/ihCCApplicationOntology/ascites_severity"));
		mappings.put("Cirrhosis Staging", new Mapping("Cirrhosis Staging", "http://sfb125.de/ontology/ihCCApplicationOntology/cirrhosis_staging"));
		mappings.put("Clinical Distant Metastasis Staging", new Mapping("Clinical Distant Metastasis Staging", "http://sfb125.de/ontology/ihCCApplicationOntology/distant_metastases_staging"));
		mappings.put("Clinical Lymph Node Staging", new Mapping("Clinical Lymph Node Staging", "http://sfb125.de/ontology/ihCCApplicationOntology/lymph_node_staging"));
		mappings.put("COPD (GOLD Classification)", new Mapping("COPD (GOLD Classification)", "http://sfb125.de/ontology/ihCCApplicationOntology/COPD_staging"));
		mappings.put("Fatty Liver Seaverity", new Mapping("Fatty Liver Seaverity", "http://sfb125.de/ontology/ihCCApplicationOntology/fatty_liver_severity"));
		mappings.put("Heart Failure (NYHA Classification)", new Mapping("Heart Failure (NYHA Classification)", "http://sfb125.de/ontology/ihCCApplicationOntology/heart_failure_staging"));
		mappings.put("Albumin", new Mapping("Albumin", "http://sfb125.de/ontology/ihCCApplicationOntology/albumin_concentration"));
		mappings.put("AP", new Mapping("AP", "http://sfb125.de/ontology/ihCCApplicationOntology/alcalic_phosphatase"));
		mappings.put("Direct Bilirubin", new Mapping("Direct Bilirubin", "http://sfb125.de/ontology/ihCCApplicationOntology/bilirubin_direct"));
		mappings.put("CRP", new Mapping("CRP", "http://sfb125.de/ontology/ihCCApplicationOntology/c_reactive_protein"));
		mappings.put("GGT", new Mapping("GGT", " http://sfb125.de/ontology/ihCCApplicationOntology/gamma_glutamyltransferase"));
		mappings.put("GOT", new Mapping("GOT", "http://sfb125.de/ontology/ihCCApplicationOntology/glutamic_oxaloacetic_transaminase"));
		mappings.put("GPT", new Mapping("GPT", "http://sfb125.de/ontology/ihCCApplicationOntology/glutamic-pyruvic_transaminase"));
		mappings.put("Hemoglobin", new Mapping("Hemoglobin", "http://sfb125.de/ontology/ihCCApplicationOntology/hemoglobin"));
		mappings.put("Total Bilirubin ", new Mapping("Total Bilirubin ", "http://sfb125.de/ontology/ihCCApplicationOntology/bilirubin_concentration"));
		mappings.put("AFP", new Mapping("AFP", " http://sfb125.de/ontology/ihCCApplicationOntology/alpha_fetoprotein"));
		mappings.put("CA19-9 ", new Mapping("CA19-9 ", "http://sfb125.de/ontology/ihCCApplicationOntology/carbohydrate_antigen_19-9_concentration"));
		mappings.put("CEA", new Mapping("CEA", "http://sfb125.de/ontology/ihCCApplicationOntology/carcinoembryonic_antigen_concentration"));
		mappings.put("MNumber of Tumors", new Mapping("Number of Tumors", "http://sfb125.de/ontology/ihCCApplicationOntology/number_of_tumors"));
		mappings.put("Platelet ", new Mapping("Platelet ", "http://sfb125.de/ontology/ihCCApplicationOntology/platelet_concentration"));
		mappings.put("WBC ", new Mapping("MWBC ", "http://sfb125.de/ontology/ihCCApplicationOntology/white_blood_cell_concentration"));
		mappings.put("Prothrombin Time (Quick) ", new Mapping("Prothrombin Time (Quick) ", "http://sfb125.de/ontology/ihCCApplicationOntology/prothrombin_time_fraction"));
		mappings.put("RLV", new Mapping("MRLV", "http://sfb125.de/ontology/ihCCApplicationOntology/estimated_remnant_liver_volume"));
		mappings.put("GFR ", new Mapping("GFR ", "http://sfb125.de/ontology/ihCCApplicationOntology/glomerular_filtration_rate"));
		mappings.put("Tumor Size", new Mapping("Tumor Size", "http://sfb125.de/ontology/ihCCApplicationOntology/tumor_size"));
		mappings.put("Postoperative ICU Care Availablity", new Mapping("Postoperative ICU Care Availablity", "http://sfb125.de/ontology/ihCCApplicationOntology/postoperative_ICU_care_availability"));	
	}
}
