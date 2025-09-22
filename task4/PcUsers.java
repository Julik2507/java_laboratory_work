public class PcUsers {

    int minutesOnPc;
    int days, hours;

    public void countDaysWithHours() {

        hours = minutesOnPc / 60;
        days = hours / 24;
    }

    public void getRecommendation() {

        if(minutesOnPc < 120) {
            System.out.print("Неплохо, но можно еще поработать!");
        } else if(minutesOnPc > 120 && minutesOnPc < 300) {
            System.out.print("Хороший рабочий день");
        } else {
            System.out.print("Сделай перерыв, хватит кодить!");
        }
    }
}