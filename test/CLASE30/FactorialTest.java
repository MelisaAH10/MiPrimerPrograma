package CLASE30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    void testFactorial() {
        Factorial factorial = new Factorial();
        // Verificar que el método factorial() funciona correctamente
        Assertions.assertEquals(1, factorial.factorial(0));
        Assertions.assertEquals(1, factorial.factorial(1));
        Assertions.assertEquals(2, factorial.factorial(2));
        Assertions.assertEquals(6, factorial.factorial(3));
        Assertions.assertEquals(24, factorial.factorial(4));
        Assertions.assertEquals(120, factorial.factorial(5));
    }

}