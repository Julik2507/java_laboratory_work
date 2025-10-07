public class Product {

    private int productNumber;
    private double price;

    public Product(int productNumber, double price) {
        this.productNumber = productNumber;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}