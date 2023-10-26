public class Employee extends Person {
    private double salary;
    public Employee(String firstName, String lastName, Byte age, Integer ssn, double salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }
    public String speak() {
        String string = "My name is: " + this.getFirstName() + " " + this.getLastName() + " and my salary is: " + this.salary;
        return string;
    }
}