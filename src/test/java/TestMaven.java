import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestMaven {

    SomethingToTest calc;

    @BeforeEach
    void init() {
        calc = new SomethingToTest();
    }
    @Test
    void test(){
        int expected = 2;
        int actual = calc.add(1, 1);

        assertEquals(actual, expected);
    }
}
