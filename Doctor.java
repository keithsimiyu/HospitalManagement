

import java.util.HashMap;
import java.util.Map;



public class Doctor implements User {
    private String username;
    private String password;
    public static final Role role = Role.DOCTOR;
    public static Map<String, String> doctorDatabase = new HashMap<>();


    public Doctor(String username, String password) {
        this.username = username;
        this.password = password;
        doctorDatabase.put(username, password);
    }
    
    public boolean login(String username, String password) throws InvalidLoginException {
        if(doctorDatabase.containsKey(username)&& doctorDatabase.get(username).equals(password)){
            System.out.println("Logged in successfully as a Doctor");
            return true;
        } else {
            throw new InvalidLoginException("Invalid Login credentials");
        }
    }


    public void logout(){
        System.out.println("Doctor logged out successfully");
    }

    public Role getRole(){
        return role;
    }

    
}
