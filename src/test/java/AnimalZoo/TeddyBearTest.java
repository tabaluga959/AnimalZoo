package AnimalZoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeddyBearTest {
    @Test
    public void shouldDontEat() {
        // given
        Animal animal = new TeddyBear("Pluszak");
        //when

        // then
        assertThrows(IDontEatExepction.class,() -> animal.eat());
    }


}