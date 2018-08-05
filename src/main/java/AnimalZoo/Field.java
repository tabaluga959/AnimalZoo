package AnimalZoo;

import java.util.HashMap;
import java.util.Map;

public class Field {
    private Map<String, Bear> game = new HashMap<>();
    public void register (Bear bear){
        bear.setField(this);
        game.put(bear.getName(),bear);
    }
    public void sendToFight(Bear from, String attack){
        Bear bear = game.get(attack);
        from.attack(bear);


    }

    }

