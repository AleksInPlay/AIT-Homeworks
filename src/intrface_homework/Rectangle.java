package intrface_homework;

public class Rectangle implements Shape{
    int a;
    int b;
    public Rectangle(int a, int  b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        System.out.println("Area of rectangle is " + a*b);


    }

    @Override
    public void findPerimeter() {
        System.out.println("Perimeter of rectangle is " + 2*(a+b));

    }
}
