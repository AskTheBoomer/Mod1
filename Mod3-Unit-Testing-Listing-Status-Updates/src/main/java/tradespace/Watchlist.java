package tradespace;

import java.util.ArrayList;
import java.util.List;

public class Watchlist {

    private List<String> favoriteListings;

    public Watchlist() {
        favoriteListings = new ArrayList<>();
    }

    public void addListing(String listing) {
        favoriteListings.add(listing);
    }

    public void removeListing(String listing) {
        favoriteListings.remove(listing);
    }

    public List<String> getFavoriteListings() {
        return favoriteListings;
    }
}
