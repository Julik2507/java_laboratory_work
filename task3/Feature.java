public class Feature {

    String[] statuses = {"Junior", "Pro", "Boss"};
    String name;
    int age;

    public String chooseStatus(int age) {
        if(age < 18) {
            return statuses[0];
        } else if(age > 18 && age < 40) {
            return statuses[1];
        } else {
            return statuses[2];
        }
    }
}