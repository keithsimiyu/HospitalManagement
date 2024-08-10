

public interface  User {
    
    boolean login(String username, String password) throws InvalidLoginException;
    void logout();
    Role getRole();
    
}
