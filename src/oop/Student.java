package oop;

public class Student {
    public String name;

    public int age;


    public static void main(String[] args) {


        Student student1 = new Student();
        student1.name = "Bill";
        student1.age = 25;

        System.out.println("Student's name is " + student1.name);
        System.out.println(student1.name + "'s age is " + student1.age);


        Student student2 = new Student();
        student2.name = "Ronald";
        student2.age = 27;

        System.out.println("Another student's name is " + student2.name);
        System.out.println(student2.name + "'s age is " + student2.age);


        Student student3 = new Student();
        student3.name = "Clifford";
        student3.age = 23;

        System.out.println("Third student's name is " + student3.name);
        System.out.println(student3.name + "'s age is " + student3.age);



        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println("Rectangle area is " + rectangle1.findArea());
        System.out.println("Rectangle perimeter is " + rectangle1.findPerimeter());

        Rectangle rectangle2 = new Rectangle(5, 10);
        System.out.println("Rectangle area is " + rectangle2.findArea());
        System.out.println("Rectangle perimeter is " + rectangle2.findPerimeter());

        Rectangle rectangle3 = new Rectangle(115, 20);
        System.out.println("Rectangle area is " + rectangle3.findArea());
        System.out.println("Rectangle perimeter is " + rectangle3.findPerimeter());



    }
}
