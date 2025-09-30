public class Invoice {

    private String detailNumber, detailDesc;
    private int thingsQuantity;
    private double thingPrice, summ;


    public Invoice(String detailNumber, String detailDesc, int thingsQuantity, double thingPrice) {
        this.detailNumber = detailNumber;
        this.detailDesc = detailDesc;
        if(thingsQuantity > 0) this.thingsQuantity = thingsQuantity;
        if(thingPrice > 0.0) this.thingPrice = thingPrice; 
    }

    public double getInvoiceAmount() {
        return summ = this.thingsQuantity * this.thingPrice;
    }

    public void setDetailNumber(String detailNumber) {
        this.detailNumber = detailNumber;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public void setThingsQuantity(int thingsQuantity) {
        if(thingsQuantity > 0) this.thingsQuantity = thingsQuantity;
    }

    public void setThingPrice(double thingPrice) {
        if(thingPrice > 0.0) this.thingPrice = thingPrice;
    }

    public String getDetailNumber() {
        return this.detailNumber;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public int getThingsQuantity() {
        return this.thingsQuantity;
    }

    public double getThingPrice() {
        return this.thingPrice;
    }
}

