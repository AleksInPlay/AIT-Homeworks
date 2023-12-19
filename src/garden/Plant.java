package garden;

public abstract class Plant {

    String name;
    int height;
    int age;
    int growthPerSeason;

    public Plant(String name, int height, int age){

        this.name = name;
        this.height = height;
        this.age = age;

    }
    public String doSpring(){

        System.out.println(name + " is starting to grow in spring from " + height + " to " + (height + growthPerSeason));


        return null;
    }
    public abstract void doSummer();


    public abstract void doAutumn();

    public String doWinter(){


        System.out.println(name + " is not growing in winter, the same height, " + height);

        return null;
    }




}
