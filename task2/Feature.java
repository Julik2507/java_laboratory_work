public class Feature {

    double price, discount;
    int quantity;


    public double countTotalPrice() {
        double total = (quantity * price) * (1 - discount / 100);
        return total;
    }
}