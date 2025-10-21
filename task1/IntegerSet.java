public class IntegerSet {

    private static final int MAX = 100;
    private boolean[] arr = new boolean[MAX + 1];

    public IntegerSet() {

        for (int i = 0; i < MAX+1; i++) {
            arr[i] = false;
        }
    }

    public void insertElement(int k) {
        if(k > -1 && k < 101) {
            this.arr[k] = true;
        }
    }

    public void deleteElement(int m) {
        if(m > -1 && m < 101) {
            this.arr[m] = false;
        }
    }

    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();

        for(int i=0; i<MAX + 1; i++) {
            result.arr[i] = a.arr[i] || b.arr[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();
        for(int i=0; i<MAX +1; i++) {
            result.arr[i] = a.arr[i] && b.arr[i];
        }
        return result;
    }

    public String toString() {
        String result = "";

        for(int i=0; i < this.MAX +1; i++) {

            result += this.arr[i] ? i+" " : "--- ";
        }
        return result;
    }

    public static boolean isEqualTo(IntegerSet a, IntegerSet b) {
        boolean isEqual = true;

        for(int i=0; i<MAX+1; i++) {
            if(a.arr[i] != b.arr[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }

}