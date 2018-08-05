package AnimalZoo;

public class KillAttack implements AttackStrategy {



    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " zabija " + defender);

    }
}
