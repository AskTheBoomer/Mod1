package tradespace;
import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();
    public boolean registerUser(String email, String password) {
        if (users.containsKey(email)) {
            return false;
        }
        if (password.length() < 8) {
            return false;
        }
        User user = new User(email, password);
        users.put(email, user);
        return true;
    }
    public boolean loginUser(String email, String password) {
        User user = users.get(email);
        if (user == null){
            return false;
        }
        return user.getPassword().equals(password);
    }
}
