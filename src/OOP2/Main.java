package OOP2;

import java.util.ArrayList;

// Problem 1: Write a Java program to ArrayList of user defined objects
public class Main {
    public static void main(String[] args) {
//        ArrayList<User> users = new ArrayList<>(); //
//        // 4 object -> add vào trong users:
//        User u1 = new User("Dung", 20);
//        User u2 = new User("Minh", 30);
//        User u3 = new User("Hung", 40);
//        User u4 = new User("Long", 50);
//        // add user:
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
//        users.add(u4);
//        // print all users:
//        for (User user : users) {
//            System.out.println(user.toString());
//        }
//
//        // "Tính tổng" số tuổi của các user trong array:
//        //getAge + vòng lặp for:
//        int sum = 0;
//        for (User user : users) {
//            sum += user.getAge();
//        }
//        System.out.println(sum);
        ArrayList<Employee> employee = new ArrayList<>();
        Employee e1 = new Employee(123, 20, "Dung", "ENG", 8000);
        Employee e2 = new Employee(789, 20, "Minh", "MATH", 5000);
        Employee e3 = new Employee(898, 20, "Hung", "LAW", 7000);

        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        for (Employee employ : employee) {
            System.out.println(employ.toString());
        }
        // Calculate the average salary of all employees.
        double aveEmployee = 0.0;
        double sum = 0.0;
        for (Employee employ : employee) {
            sum += employ.getSalary();

        }
        // size , length
        aveEmployee = sum / employee.size();
        System.out.println(aveEmployee);
    }
}
