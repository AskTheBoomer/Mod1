package tradespace;

public class Profile {
    private String name;
    private String photo;
    private String bio;
    private String location;
    public Profile(String name, String photo, String bio, String location) {
        this.name = name;
        this.photo = photo;
        this.bio = bio;
        this.location = location;
    }
    public void updateProfile(String name, String photo, String bio, String location) {
        this.name = name;
        this.photo = photo;
        this.bio = bio;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getPhoto() {
        return photo;
    }
    public String getBio() {
        return bio;
    }
    public String getLocation() {
        return location;
    }
}