package practice;

public class Square extends Figure {


    public Square(int a) {
        super(a);
    }

    public double findArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square has area of " + findArea();

    }
}
