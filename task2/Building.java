// import java.util.Random;

public class Building implements CarbonFootprint {

    private final double X1 = 0.000233, X2 = 2.0;
    private double electricityUsed, gasUsed;

    private String address = "Chisinau, Alba-Iulia";

    public Building(double electricityUsed, double gasUsed ) {
        this.electricityUsed = electricityUsed;
        this.gasUsed = gasUsed;
    }

    public double getCarbonFootprint() {
        return this.electricityUsed * X1 + this.gasUsed * X2;
    }

    public String getAddress() {return this.address;}


}