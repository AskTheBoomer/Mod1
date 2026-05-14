package tradespace;

public class Listing {
    private String title;
    private double price;
    private ListingStatus status;

public Listing(String title, double price) {
    this.title = title;
    this.price = price;
    this.status = ListingStatus.AVAILABLE;
}

public String getTitle() {
    return title;
}

public double getPrice() {
    return price;
}

public ListingStatus getStatus() {
    return status;
}

public void setStatus(ListingStatus status) {
    this.status = status;
}

}