import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calculate = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculate.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(3, calculate.dif(5, 2));
    }

    @Test
    void div() throws Exception {
        assertEquals(3, calculate.div(9, 3));
        assertThrows(Exception.class, () -> {
            calculate.div(9, 0);
        });
    }

    @Test
    void times() {
        assertEquals(6, calculate.times(2, 3));
    }

    @Test
    void solver() {
        assertEquals(1,calculate.dif((calculate.add(10,1)),10));
    }
}