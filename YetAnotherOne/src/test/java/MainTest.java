import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class MainTest {

    @Test
    public void testFibonacci1() {
        int num = 5;
        long expected = 5;
        long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci2() {
        int num = 10;
        long expected = 55;
        long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci3() {
        int num = 0;
        long expected = 0;
        long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci4() {
        int num = 1;
        long expected = 1;
        long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci5() {
        int num = -5;
        Assertions.assertThrows(InvalidParameterException.class, () -> Main.fibonacci(num));
    }
}
