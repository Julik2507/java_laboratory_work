public class EmployeeTest {

    public static void main(String[] args) {

        Employee person1 = new Employee("Iulian", "Izman", 10000);
        Employee person2 = new Employee("Test", "Testovich", 5000);

        double yearSalary1 = person1.getSalary() * 12;
        double yearSalary2 = person2.getSalary() * 12;

        System.out.printf("ЗП первого сотрудника за год - %.2f\n", yearSalary1);
        System.out.printf("ЗП второго сотрудника за год - %.2f\n\n", yearSalary2);

        person1.setSalary(person1.salary + (person1.salary * 10 / 100));
        person2.setSalary(person2.salary + (person1.salary * 10 / 100));
    
        System.out.printf("ЗП первого сотрудника за год - %.2f\n", person1.getSalary()*12);
        System.out.printf("ЗП второго сотрудника за год - %.2f\n", person2.getSalary()*12);

    }

    
}