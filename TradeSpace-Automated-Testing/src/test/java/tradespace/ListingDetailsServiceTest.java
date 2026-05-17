package tradespace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListingDetailsServiceTest {
    @Test
    public void getListingStatus_returnsAvailable() {
        Listing listing =
                new Listing("Desk Chair", 85.00);
        ListingDetailsService service =
                new ListingDetailsService();
        assertEquals(
                "AVAILABLE",
                service.getListingStatus(listing)
        );
    }
    @Test
    public void getListingStatus_returnsSold() {
        Listing listing =
                new Listing("Monitor", 150.00);
        listing.setStatus(ListingStatus.SOLD);
        ListingDetailsService service =
                new ListingDetailsService();
        assertEquals(
                "SOLD",
                service.getListingStatus(listing)
        );
    }
}