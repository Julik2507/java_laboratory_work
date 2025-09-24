public class Date {

    int month, day, year;

    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void displayDate() {
        System.out.printf("%d / %d / %d\n", month, day, year);
    }

    int getMonth() {
        return this.month;
    }

    int getDay() {
        return this.day;
    }

    int getYear() { 
        return this.year;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setDay(int day) {
        this.day = day;
    }

    void setYear(int year) {
        this.year = year;
    }
}