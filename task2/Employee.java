public class Employee {

    private String name, lastName;
    private double salary;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        if(salary > 0.0) this.salary = salary;
    }

    public String getName() {return this.name;}
    public String getLastName() {return this.lastName;}
    public double getSalary() {return this.salary;}

    public void setName(String name) {this.name = name;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setSalary(double salary) {
        if(salary > 0.0) this.salary = salary;
    }
}