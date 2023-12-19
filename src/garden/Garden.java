package garden;

public class Garden {
    public static void main(String[] args) {


        Plant flower = new Flower("Tulip", 0, 0);
        Plant tree = new Tree("Pine", 100, 0);

        Plant[] plants = {flower, tree};
        for (Plant x : plants) {

            x.doSpring();
            x.doSummer();
            x.doAutumn();
            x.doWinter();
        }



    }
}
