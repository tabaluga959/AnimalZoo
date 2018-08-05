package AnimalZoo;

public class InjureAttack implements AttackStrategy {


    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " rani " + defender);

    }
}
