package AnimalZoo;

public class ZooApp {
    public static void main(String[] args) {
        Field field = new Field();
        Bear bear = new PolarBear("Czesiek");
        Bear bear1 = new BlackBear("Andrzej");
        Bear bear2 = new BrownBEar("Stasiek");

        field.register(bear);
        field.register(bear1);
        field.register(bear2);

        bear.attackBear("Stasiek");
        bear1.attackBear("Stasiek");


    }
}
