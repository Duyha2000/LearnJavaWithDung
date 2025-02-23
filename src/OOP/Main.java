package OOP;

// https://docs.google.com/document/d/1qy5h1qtBPgGwGrsEiU4WPrS_CPPkN2va1QSpBCU21fE/edit?tab=t.0
public class Main {
    public static void main(String[] args) {
        Employee abc = new Employee("ABC", 1000);
        abc.newSalary(20);
        System.out.println(abc.getCurrentSalary());
        System.out.println(abc); // toString
    }
}

