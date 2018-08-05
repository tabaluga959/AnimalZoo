package AnimalZoo;

public class BlackBear extends Bear{
    private AttackStrategy attackStrategy;

    public BlackBear(String name) {
        super(name);
        attackStrategy = new InjureAttack();
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);

    }
}


