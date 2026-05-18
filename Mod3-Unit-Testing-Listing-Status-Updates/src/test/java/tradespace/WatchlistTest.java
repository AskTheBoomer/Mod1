package tradespace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WatchlistTest {

    @Test
    public void addListing_addsListingToFavoritesCorrectly() {
        Watchlist watchlist = new Watchlist();

        watchlist.addListing("Gaming Laptop");

        assertEquals(1,
                watchlist.getFavoriteListings().size());

        assertEquals("Gaming Laptop",
                watchlist.getFavoriteListings().get(0));
    }

    @Test
    public void removeListing_removesListingCorrectly() {
        Watchlist watchlist = new Watchlist();

        watchlist.addListing("Gaming Laptop");
        watchlist.removeListing("Gaming Laptop");

        assertEquals(0,
                watchlist.getFavoriteListings().size());
    }
}
