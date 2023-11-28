public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", "Delicious chocolate bar", 5,  "Mars");
        products[1] = new Cake("Cake", "Fresh Cake with fruits",1.49,  "cheery");
        products[2] = new Bread("Bread", "Freshly baked bread", 2.49, true);

        // listProducts metoduna diziyi parametre olarak geçme
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}