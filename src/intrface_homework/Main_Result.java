package intrface_homework;

public class Main_Result {
    public static void main(String[] args) {

        Circle circle1 = new Circle(25);
        Circle circle2 = new Circle(50);

        Rectangle rectangle1 = new Rectangle(40, 15);
        Rectangle rectangle2 = new Rectangle(50, 25);


        Shape[] shapes = {circle1, circle2, rectangle1, rectangle2};
        for (Shape x : shapes) {
            x.findArea();
            x.findPerimeter();

        }

        }

    }



