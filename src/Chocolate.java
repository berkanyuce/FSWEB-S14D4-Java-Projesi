public class Chocolate extends ProductForSale{
    private String brand;
    public Chocolate(String type, String description, double price ,String brand) {
        super(type, description, price);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Brand: " + brand);
    }
}
