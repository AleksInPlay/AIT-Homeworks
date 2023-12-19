package garden;

public class Flower extends Plant {
int growthPerSeason = 10;

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }
    public String doSpring(){

        System.out.println(name + " is starting to grow in spring from " + height + " to " + (height + growthPerSeason));


        return null;
    }

    @Override
    public void doSummer() {

        System.out.println(name + " is blooming, not growing in summer. Height = " + (height + growthPerSeason));

    }

    @Override
    public void doAutumn() {
        System.out.println(name + " is being cut in autumn. Height = " + height);

    }


}
