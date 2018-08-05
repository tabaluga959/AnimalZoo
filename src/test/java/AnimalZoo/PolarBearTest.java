package AnimalZoo;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class PolarBearTest {
    @Test
    public void shouldBeAliveAfterBorn() {
        // given
        PolarBear animal = new PolarBear("Czesiek");
        //when

        // then
        assertTrue(animal.isAlive());
    }

    @Test
    public void shouldBeAliveAfterEating() throws IDontEatExepction {
        // given
        PolarBear animal = new PolarBear("Czesiek");
        //when
        animal.eat();

        // then
       assertTrue(animal.isAlive());
    }

    @Test
    public void shouldBeDeadchIfEat11DaysBefore() {
        // given
        Animal animal = spy(new PolarBear("Czesiek"));
        //when
        LocalDateTime value = LocalDateTime.now().minusDays(11);
        when(animal.getNow()).thenReturn(value);
        // then
        assertFalse(animal.isAlive());
    }

    @Test
    public void should() {
        // given
        Animal animal = new PolarBear("Czesiek");
        //when

        // then
        animal.display();
    }


}