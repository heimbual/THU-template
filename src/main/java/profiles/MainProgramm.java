package profiles;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;

import server.Server;

public class MainProgramm extends Thread {

	public static void main(String[] args) {
//		HardcodeReader test = new HardcodeReader();
//		test.outputLink("hepatitis_b");
//		test.outputLink("hepatitis_c");
//		test.outputLink("bilirubin_concentration");
//		//public createPatient(String gender, boolean hepatitis_b, String bilirubin_concentration) {
//		createPatient alpha = new createPatient("male",true,"33");
//		alpha.output();
//		createPatient beta = new createPatient("female",false,"31");
//		beta.output();
		Server server = new Server();
		String patient_id = server.createPatient("John", "Doe", AdministrativeGender.MALE);
		//ObservationModel observation = new ObservationModel();
		
		System.out.println("Patient id: " + patient_id);
		
	}
}
