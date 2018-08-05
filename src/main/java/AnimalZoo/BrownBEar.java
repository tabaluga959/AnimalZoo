package AnimalZoo;

public class BrownBEar extends Bear {
    private AttackStrategy attackStrategy;
    public BrownBEar(String name) {
        super(name);
        attackStrategy = new InjureAttack();

    }


    @Override
    public void attack(Animal animal) {

    }
}
