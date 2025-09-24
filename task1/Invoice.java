public class Invoice {

    String detailNumber, detailDesc;
    int thingsQuantity;
    double thingPrice, summ;


    Invoice(String detailNumber, String detailDesc, int thingsQuantity, double thingPrice) {
        this.detailNumber = detailNumber;
        this.detailDesc = detailDesc;
        this.thingsQuantity = thingsQuantity;
        this.thingPrice = thingPrice;

        if(thingsQuantity < 0) this.thingsQuantity = 0;
        if(thingPrice < 0.0) this.thingPrice = 0.0;
    }

    double getInvoiceAmount() {
        return summ = this.thingsQuantity * this.thingPrice;
    }

    void setDetailNumber(String detailNumber) {
        this.detailNumber = detailNumber;
    }

    void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    void setThingsQuantity(int thingsQuantity) {
        this.thingsQuantity = thingsQuantity;
    }

    void setThingPrice(double thingPrice) {
        this.thingPrice = thingPrice;
    }

    String getDetailNumber() {
        return this.detailNumber;
    }

    String getDetailDesc() {
        return this.detailDesc;
    }

    int getThingsQuantity() {
        return this.thingsQuantity;
    }

    double getThingPrice() {
        return this.thingPrice;
    }
}