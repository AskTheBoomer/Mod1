package tradespace;

public class ListingService {

    public void submitOffer(Listing listing) {
        listing.setStatus(ListingStatus.PENDING);
    }

    public void completePurchase(Listing listing) {
        listing.setStatus(ListingStatus.SOLD);
    }
}