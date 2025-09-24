public class InvoiceTest {

    public static void main(String[] args) {

        Invoice receipt = new Invoice("id1856", "good detail", 20, 37.5);

        System.out.printf("Ваш номер заказа - %s, к оплате - %.2f\n", receipt.getDetailNumber(), receipt.getInvoiceAmount());

        receipt.setThingPrice(99999.1);
        receipt.setDetailNumber("id12494");

        System.out.printf("Ваш номер заказа - %s, к оплате - %.2f\n", receipt.getDetailNumber(), receipt.getInvoiceAmount());
    }

}