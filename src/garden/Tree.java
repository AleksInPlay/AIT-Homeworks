package garden;

public class Tree extends Plant{
    int growthPerSeason = 50;

    public Tree(String name, int height, int age) {

        super(name, height, age);
    }
    public String doSpring(){


        System.out.println(name + " is starting to grow in spring from " + height + " to " + (height + growthPerSeason));


        return null;
    }
    @Override
    public void doSummer() {
        System.out.println(name + " is growing in summer from " + (height + growthPerSeason) + " to " + ((height + growthPerSeason) + growthPerSeason));

    }

    @Override
    public void doAutumn() {
        System.out.println(name + " is not growing in autumn. Height = " + ((height + growthPerSeason) + growthPerSeason));

    }
    public String doWinter(){


        System.out.println(name + " is not growing in winter, the same height, " + ((height + growthPerSeason) + growthPerSeason));

        return null;
    }


}
