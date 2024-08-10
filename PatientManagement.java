import java.util.HashMap;
import java.util.Map;

public class PatientManagement {
    private  Map<String, Patient> patients;


    public PatientManagement(){
        patients = new HashMap<>();
    }

    public void addPatient(User user, Patient patient){
        if(user.getRole() == Role.ADMIN || user.getRole() == Role.DOCTOR){
            patients.put(patient.getPatientId(), patient);
            System.out.println("Patient added Successfully");
        } else {
            System.out.println("Unauthorized to add patient");
        }

    }

    public void removePatient(User user, String patientId){
        if(user.getRole() == Role.ADMIN || user.getRole() == Role.DOCTOR){
            patients.remove(patientId);
            System.out.println("Patient removed successfully");
        } else {
            System.out.println("Unauthorized to remove the patient in the database");
        }
    }

    public void updatePatient(User user, String PatientId, Patient updatePatient){
        if(user.getRole() == Role.ADMIN){
            patients.put(PatientId, updatePatient);
            System.out.println("Patient updated Successfully");
        }

    }
    public void displayPatient(String patientId){
        if(patients.containsKey(patientId)){
            patients.get(patientId).displayInfo();
        } else{
            System.out.println("Patient records not found");
        }
    }
    
}
