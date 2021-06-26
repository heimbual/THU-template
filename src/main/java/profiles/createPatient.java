package profiles;

import static org.junit.Assert.assertEquals;

import java.nio.file.spi.FileSystemProvider;

import org.hl7.fhir.r4.model.Enumerations;


public class createPatient {

	private static int record_id = 0;
	private String gender;
	private boolean hepatitis_b;
	private String bilirubin_concentration;
	private boolean correct_gender;

//	 ObservationModel observation = new ObservationModel("http://sfb125.de/ontology/ihCCApplicationOntology/", "bilirubin_concentration", 1, "mg/dl");
//     String patientID = server.createPatient("Doe", "John", Enumerations.AdministrativeGender.MALE);
//     String observationID = server.createNumericalObservation(observation, patientID);
//     assertEquals(167, observationID.length());

	public createPatient(String gender, boolean hepatitis_b, String bilirubin_concentration) {
		correct_gender=true;
		this.gender = gender;
		this.hepatitis_b = hepatitis_b;
		this.bilirubin_concentration = bilirubin_concentration;
		record_id++;
		
	}

	public void output() {
		System.out.println("ID: " +record_id+
				" Geschlecht: " + gender + " Hepaptitis: " + hepatitis_b + " Bilirubin: " + bilirubin_concentration);
	}

	}


