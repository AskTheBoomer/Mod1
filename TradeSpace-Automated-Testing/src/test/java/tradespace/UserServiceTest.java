package tradespace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void registerUser_validRegistration_returnsTrue() {
        UserService userService = new UserService();
        boolean result = userService.registerUser("test@email.com", "password123");
        assertTrue(result);
    }
    @Test
    public void registerUser_duplicateEmail_returnsFalse() {
        UserService userService = new UserService();
        userService.registerUser("test@email.com", "password123");
        boolean result = userService.registerUser("test@email.com", "password123");
        assertFalse(result);
    }
    @Test
    public void registerUser_weakPassword_returnsFalse() {
        UserService userService = new UserService();
        boolean result = userService.registerUser("test@email.com", "123");
        assertFalse(result);
    }
    @Test
    public void loginUser_validCredentials_returnsTrue() {
        UserService userService = new UserService();
        userService.registerUser("test@email.com",  "password123");
        boolean result = userService.loginUser("test@email.com", "password123");
        assertTrue(result);
    }
}
