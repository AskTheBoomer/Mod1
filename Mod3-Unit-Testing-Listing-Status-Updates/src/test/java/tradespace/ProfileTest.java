package tradespace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfileTest {
    @Test
    public void updateProfile_changesProfileInformation() {
        Profile profile = new Profile("John", "photo1.jpg", "Old bio", "San Diego");
        profile.updateProfile("John Doe", "photo2.jpg", "Updated bio", "Los Angeles");
        assertEquals("John Doe", profile.getName());
        assertEquals("photo2.jpg", profile.getPhoto());
        assertEquals("Updated bio", profile.getBio());
        assertEquals("Los Angeles", profile.getLocation());
    }
}