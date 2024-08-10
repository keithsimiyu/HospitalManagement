

public class Main {
    public static void main(String[] args) {
        
        try {
            Admin admin = new Admin("admin", "admin123");
            Doctor doctor =  new Doctor("doc", "doc123");
            Nurse nurse = new Nurse("nurse", "nurse123");
            PatientUser patientUser = new PatientUser("patient", "patient123");

            PatientManagement patientManagement = new PatientManagement();

            admin.login("admin", "admin123");
            doctor.login("doc", "doc123");
            nurse.login("nurse", "nurse123");
            patientUser.login("patient", "patient123");


            //creating patients
            Outpatient outpatient = new Outpatient("123", "Kelvin alvin", 37, "4th street kasarani", "Dr Amoth", 24, 6);
            Inpatient inpatient = new Inpatient("101", "Caro", 29, "9th street karen", "room 105", "Dr Gideon", 7);

            patientManagement.addPatient(admin, inpatient);
            patientManagement.addPatient(doctor, outpatient);


            //update details
            inpatient.setRoomNumber("room 110");
            patientManagement.updatePatient(admin, inpatient.getPatientId(), inpatient);

            //remove patient
            patientManagement.removePatient(admin, outpatient.getPatientId());


            //logout users
            admin.logout();
            nurse.logout();
            doctor.logout();
            patientUser.logout();

            
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
