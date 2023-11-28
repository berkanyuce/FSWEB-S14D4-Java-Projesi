abstract class ProductForSale {
    private String type;
    private String description;
    private double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public abstract void showDetails();

}
