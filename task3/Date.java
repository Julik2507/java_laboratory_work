public class Date {

    private int month, day, year;

    public Date(int month, int day, int year) {
        // validateDate(month, day, year);
        validateDate(month, day, year);
    }

    // private void validateDate(int month, int day, int year) {
    //     if(year>0 && year<2026) {

    //                 if(month>0 && month<13) {

    //                     if((month==1 && day==31) ||
    //                     (month==3 && day==31) ||
    //                     (month==4 && day==30) ||
    //                     (month==5 && day==31) ||
    //                     (month==6 && day==30) ||
    //                     (month==7 && day==31) ||
    //                     (month==8 && day==31) ||
    //                     (month==9 && day==30) ||
    //                     (month==10 && day==31)) {
    //                         this.month = month;
    //                         this.day = day;
    //                         this.year = year;
    //                     }

    //                     if(month==2 && (day==28 || day==29)) {
    //                         this.month = month;
    //                         this.day = day;
    //                         this.year = year;
    //                     }   
    //                 }
    //             }
    // }

    private void validateDate(int month, int day, int year) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isLeapYear(year)) daysInMonth[1]-=1;
        // System.out.println(daysInMonth[1]);

        if((month>0 && month<13) && (day == daysInMonth[month-1]) && (year>0 && year<2026)) {
            // System.out.println(day);
            // System.out.println(daysInMonth[month-1]);
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            this.month = 0;
            this.day = 0;
            this.year = 0; 
        }
    }

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }


    public void displayDate() {
        System.out.printf("%d / %d / %d\n", month, day, year);
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public int getYear() { 
        return this.year;
    }

    public void setMonth(int month) {
        validateDate(month, this.day, this.year);
    }

    public void setDay(int day) {
        validateDate(this.month, day, this.year);

    }

    public void setYear(int year) {
        validateDate(this.month, this.day, year);
    }
}