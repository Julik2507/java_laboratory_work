
public class Main {

    public static void main(String[] args) {

        IntegerSet myIntegerSet1 = new IntegerSet();
        IntegerSet myIntegerSet2 = new IntegerSet();
        IntegerSet myIntegerSet3 = new IntegerSet();

        myIntegerSet1.insertElement(20);
        myIntegerSet2.insertElement(25);
        myIntegerSet3.insertElement(30);
        myIntegerSet1.insertElement(25);
        myIntegerSet2.insertElement(50);
        myIntegerSet3.insertElement(25);
        myIntegerSet1.insertElement(30);
        myIntegerSet2.insertElement(20);

        System.out.println(IntegerSet.union(myIntegerSet1, myIntegerSet2));

        System.out.println(IntegerSet.intersection(myIntegerSet1, myIntegerSet2));


        System.out.println(IntegerSet.isEqualTo(myIntegerSet1, myIntegerSet2));

        System.out.println(myIntegerSet1);
    }

}