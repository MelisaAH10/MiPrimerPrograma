package CLASE28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    public void testSuma() {
        assertEquals(5, Calculadora.suma(2, 3));
    }

    @Test
    public void testResta() {
        assertEquals(-1, Calculadora.resta(2, 3));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, Calculadora.multiplicacion(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculadora.division(6, 3));
    }

    @Test
    public void testDivisionPorCero() {
        try {
            Calculadora.division(6, 0);
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage());
        }
    }
    @Test
    public void testMain() {
        ByteArrayInputStream in = new ByteArrayInputStream("1\n2\n3\n5\n".getBytes());
        System.setIn(in);
        Calculadora.main(new String[]{});
        String salidaReal = outputStreamCaptor.toString().replace(System.lineSeparator(), "\n");
        String salidaEsperada = "1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nSeleccione una opción: Ingrese el primer número: Ingrese el segundo número: Resultado: 5.0\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nSeleccione una opción: ";
        assertEquals(salidaEsperada, salidaReal);
    }
}