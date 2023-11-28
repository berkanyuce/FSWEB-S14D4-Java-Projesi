public class Bread extends ProductForSale{
    private boolean isDiet;
    public Bread(String type, String description, double price ,boolean isDiet) {
        super(type, description, price);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", is Diet?: " + isDiet);
    }
}
