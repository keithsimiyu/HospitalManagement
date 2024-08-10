
import java.util.HashMap;
import java.util.Map;

public class Admin implements User {
    private String username;
    private String password;
    public static final Role role = Role.ADMIN;
    public static Map<String, String> adminDatabase = new HashMap<>();


    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        adminDatabase.put(username, password);

    }

    public boolean login(String username, String password) throws InvalidLoginException{
        if(adminDatabase.containsKey(username)&& adminDatabase.get(username).equals(password)){
            System.out.println("Admin logged in Successfully");
            return true;
        } else {
            throw new InvalidLoginException("Invalid login credential for the Admin");
        }
    }

    public void logout(){
        System.out.println("Admin logged out Successfully");
    }

    public Role getRole(){
        return role;
    }
 
}
