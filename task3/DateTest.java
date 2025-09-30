public class DateTest {

    public static void main(String[] args) {
        
        Date myCorrectDate = new Date(2, 28, 2000);
        myCorrectDate.displayDate();
        myCorrectDate.setYear(1999);
        myCorrectDate.displayDate();

        Date myWrongDate = new Date(2, 29, 2000);
        myWrongDate.displayDate();
        myWrongDate.setYear(1999);
        myWrongDate.displayDate();

    }
}

//валидировать даты
//добавить для аттрибутов private, для конструктора и методов - public