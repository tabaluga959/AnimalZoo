package AnimalZoo;

import java.time.LocalDateTime;

public class TeddyBear extends Animal{
    public TeddyBear(String name) {
        super(name);
    }

    @Override
    public LocalDateTime eat() throws IDontEatExepction {
        throw new IDontEatExepction();
    }
}
