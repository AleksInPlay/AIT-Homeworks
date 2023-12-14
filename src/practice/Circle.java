package practice;

public class Circle extends Figure {


    public Circle(int a) {
        super(a);
    }

    public double findArea() {
        return Math.PI * a * a;
    }

    @Override
    public String toString() {
        return "Circle has area of " + findArea();
    }
}
