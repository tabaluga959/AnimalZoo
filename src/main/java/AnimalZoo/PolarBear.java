package AnimalZoo;

public class PolarBear extends Bear{
        private AttackStrategy attackStrategy;


    public PolarBear(String name) {
       super(name);
       attackStrategy = new KillAttack();

    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);

    }
}
