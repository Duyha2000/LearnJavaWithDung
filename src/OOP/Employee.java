package OOP;

public class Employee {
    private String name;

    private double currentSalary;

    // void: in ra giá trị, cập nhật giá trị
    public void newSalary(double percent) {
        currentSalary = currentSalary + (currentSalary * percent) / 100;
    }

    public Employee(String name, double currentSalary) {
        this.name = name;
        this.currentSalary = currentSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", currentSalary=" + currentSalary +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    // currentSalary: 1tr - 20
    // 1tr2

}

