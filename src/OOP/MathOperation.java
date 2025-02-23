package OOP;

public class MathOperation {
    private int a, b;

    public MathOperation(int b, int a) {
        this.b = b;
        this.a = a;
    }

    // polymorphism
    public MathOperation() {
    }

    public int add(int a, int b) {
        return a + b;

    }

    public double add(double a, double b) {
        return a + b;
    }

    // polymorphism:
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // public double area(){}


}
