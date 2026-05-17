package tradespace;

public class ListingDetailsService {
    public String getListingStatus(Listing listing) {
        return listing.getStatus().name();
    }
}