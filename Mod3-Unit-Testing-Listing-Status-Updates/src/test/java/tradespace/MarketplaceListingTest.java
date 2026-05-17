package tradespace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketplaceListingTest {
    @Test
    public void createListing_storesListingInformationCorrectly() {
        MarketplaceListing listing =
                new MarketplaceListing(
                        "Gaming Laptop",
                        "ASUS ROG Gaming Laptop",
                        1800.00,
                        "Electronics",
                        "Murrieta",
                        "laptop.jpg",
                        SaleType.AUCTION
                );
        assertEquals("Gaming Laptop",
                listing.getTitle());
        assertEquals("ASUS ROG Gaming Laptop",
                listing.getDescription());
        assertEquals(1800.00,
                listing.getPrice());
        assertEquals("Electronics",
                listing.getCategory());
        assertEquals("Murrieta",
                listing.getLocation());
        assertEquals("laptop.jpg",
                listing.getImage());
        assertEquals(SaleType.AUCTION,
                listing.getSaleType());
    }
}