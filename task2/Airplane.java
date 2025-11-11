public class Airplane implements CarbonFootprint {

    private double distanceInKilometers, emissionFactorPerKilometr, numberOfPassengers;

    private String manufacturer = "Boeing";

    public Airplane(double distanceInKilometers, double emissionFactorPerKilometr, double numberOfPassengers) {
        this.distanceInKilometers = distanceInKilometers;
        this.emissionFactorPerKilometr = emissionFactorPerKilometr;
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getCarbonFootprint() {
        return (emissionFactorPerKilometr * distanceInKilometers) / numberOfPassengers;
    }

    public String getManufacturer() {return this.manufacturer;}
}