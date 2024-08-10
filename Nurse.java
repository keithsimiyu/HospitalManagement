
import java.util.HashMap;
import java.util.Map;


public class Nurse implements User {
    private String username;
    private String passsword;
    private static final Role role = Role.NURSE;
    private static Map<String, String> nurseDatabase = new HashMap<>();


    public Nurse(String username, String passsword) {
        this.username = username;
        this.passsword = passsword;
        nurseDatabase.put(username, passsword);
    }

    public boolean login(String username, String password) throws InvalidLoginException{
        if(nurseDatabase.containsKey(username)&& nurseDatabase.get(username).equals(password)){
            System.out.println("The Nurse has Successfully Logged in");
            return true;
        } else {
            throw new InvalidLoginException("Invalid loggin credentials for the Nurse");
        }
    }
    public void logout(){
        System.out.println("Nurse logged Out");
    }
    public Role getRole(){
        return role;
    }

    
}