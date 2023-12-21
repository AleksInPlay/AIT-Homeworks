package intrface_homework;

public class Circle implements Shape{
    int r;
    public Circle (int r){
        this.r = r;
    }

    @Override
    public void findArea() {
        System.out.println("Area of circle is " + Math.PI * (r * r));

    }


    @Override
    public void findPerimeter() {
        System.out.println("Perimeter of circle is " + 2*Math.PI*r);

    }
}
