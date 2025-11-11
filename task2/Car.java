public class Car implements CarbonFootprint {

    private final double X1 = 2.31;
    private double fuelUsed;

    private String manufacturer = "Audi";

    public Car(double fuelUsed) {
        this.fuelUsed = fuelUsed;
    }
    
    public double getCarbonFootprint() {
        return fuelUsed * X1;
    }

    public String getManufacturer() {return this.manufacturer;}

}