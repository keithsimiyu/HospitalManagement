
import java.util.HashMap;
import java.util.Map;


public class PatientUser implements User {
    private String username;
    private String password;
    private static final Role role = Role.PATIENT;
    private static Map<String , String> patientDatabase = new HashMap<>();


    public PatientUser(String username, String password) {
        this.username = username;
        this.password = password;
        patientDatabase.put(username, password);
    }


   public boolean login(String username, String password) throws InvalidLoginException{
    if(patientDatabase.containsKey(username) && patientDatabase.get(username).equals(password)){
        System.out.println("Patient logged in Successfully");
        return true;
    } else {
        throw new InvalidLoginException("Invalid login credentials for the patient");
    }
   }

   public void logout(){
    System.out.println("You have logged out successfully");
   }
 
   public Role getRole(){
    return role;
   }

   public String getPatientId(){
    return "place_holder_patientId";
   }
    
}
