public class Employee {

    String name, lastName;
    double salary;

    Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        if(salary >= 0.0) {
            this.salary = salary;
        }
    }

    String getName() {return this.name;}
    String getLastName() {return this.lastName;}
    double getSalary() {return this.salary;}

    void setName(String name) {this.name = name;}
    void setLastName(String lastName) {this.lastName = lastName;}
    void setSalary(double salary) {
        if(salary >= 0.0) this.salary = salary;
    }
}