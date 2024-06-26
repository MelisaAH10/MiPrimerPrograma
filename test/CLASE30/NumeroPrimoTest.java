package CLASE30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumeroPrimoTest {

    @Test
    void testEsPrimo() {
        NumeroPrimo primo = new NumeroPrimo();

        // Verificar que el método esPrimo() funciona correctamente
        Assertions.assertTrue(primo.esPrimo(2));
        Assertions.assertTrue(primo.esPrimo(3));
        Assertions.assertTrue(primo.esPrimo(5));
        Assertions.assertTrue(primo.esPrimo(7));
        Assertions.assertFalse(primo.esPrimo(4));
        Assertions.assertFalse(primo.esPrimo(6));
        Assertions.assertFalse(primo.esPrimo(8));
        Assertions.assertFalse(primo.esPrimo(9));
    }

    @ParameterizedTest
    @CsvSource({"2, true", "3, true", "5, true", "7, true", "4, false", "6, false", "8, false", "9, false"})
    void testEsPrimo(int numero, boolean esperado) {
        NumeroPrimo primo = new NumeroPrimo();

        // Verificar que el método esPrimo() funciona correctamente
        Assertions.assertEquals(esperado, primo.esPrimo(numero));
    }
}