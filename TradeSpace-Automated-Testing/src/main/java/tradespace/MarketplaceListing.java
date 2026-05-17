package tradespace;

public class MarketplaceListing {
    private String title;
    private String description;
    private double price;
    private String category;
    private String location;
    private String image;
    private SaleType saleType;
    public MarketplaceListing(String title,
                              String description,
                              double price,
                              String category,
                              String location,
                              String image,
                              SaleType saleType) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.location = location;
        this.image = image;
        this.saleType = saleType;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getLocation() {
        return location;
    }
    public String getImage() {
        return image;
    }
    public SaleType getSaleType() {
        return saleType;
    }
}