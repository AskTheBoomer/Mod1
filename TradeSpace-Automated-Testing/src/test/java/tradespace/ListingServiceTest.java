package tradespace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListingServiceTest {

    @Test
    public void submitOffer_changesListingStatusToPending() {
        Listing listing = new Listing("Gaming Chair", 75.00);
        ListingService listingService = new ListingService();

        listingService.submitOffer(listing);

        assertEquals(ListingStatus.PENDING, listing.getStatus());
    }

    @Test
    public void completePurchase_changesListingStatusToSold() {
        Listing listing = new Listing("Mountain Bike", 250.00);
        ListingService listingService = new ListingService();

        listingService.completePurchase(listing);

        assertEquals(ListingStatus.SOLD, listing.getStatus());
    }
}