package practice;

public class Rectangle extends Figure {


    public Rectangle(int a, int b) {
        super(a, b);
    }

    public double findArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle has area of " + findArea();
    }
}
