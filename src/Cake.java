public class Cake extends ProductForSale{
    private String fruit;
    public Cake(String type, String description, double price ,String fruit) {
        super(type, description, price);
        this.fruit = fruit;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice() +
                ", Description: " + getDescription() +
                ", Fruit: " + fruit);
    }
}
