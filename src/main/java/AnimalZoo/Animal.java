package AnimalZoo;

import java.time.LocalDateTime;

abstract class Animal {
    LocalDateTime now = LocalDateTime.now();
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {

        this.name = name;
    }

    public int weight;

    public int getWeight(int weight) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return now.isAfter(LocalDateTime.now().minusDays(10));


    }


    public LocalDateTime eat() throws IDontEatExepction {

        System.out.println(now);
        return now;


    }

    public LocalDateTime getNow() {
        return now;
    }

    public void display(){
        System.out.println("Jestem " + getClass().getSimpleName() + " Ważę: " + getWeight(200));

    }
    @Override
    public String toString() {
        return name;
    }

}

