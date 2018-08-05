package AnimalZoo;

 class Bear extends Animal implements Attackable {
    private Field field;

     public Bear(String name) {
         super(name);

     }

     public Field getField() {

        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }


    public void attackBear (String defender) {
        field.sendToFight(this,defender);
}


     @Override
     public void attack(Animal animal) {


     }
 }
