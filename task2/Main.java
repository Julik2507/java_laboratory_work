import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> things = new ArrayList<CarbonFootprint>();

        Building myBuilding = new Building(12312.123, 32534.2);
        Car myCar = new Car(124.1);
        Airplane myAirplane = new Airplane(9234283.2, 23949234.5, 8124.76);


        things.add(myBuilding);
        things.add(myCar);
        things.add(myAirplane);

        for(int i=0; i<3; i++) {
            System.out.println(things.get(i).getCarbonFootprint());
        }
        System.out.println('\n');

        for(int i=0; i<3; i++) {
            if(things.get(i) instanceof Building) {
                System.out.println(((Building) things.get(i)).getAddress());
            } else if(things.get(i) instanceof Car) {
                System.out.println(((Car) things.get(i)).getManufacturer());
            } else if(things.get(i) instanceof Airplane) {
                System.out.println(((Airplane) things.get(i)).getManufacturer());
            }
        }
        // Building el1 = things.get(0); 
        // System.out.println(el1.address);
    }
}   