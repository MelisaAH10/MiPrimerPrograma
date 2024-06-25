package CLASE28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NumeroTest {
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
    public void testSolicitarNumero() {
        ByteArrayInputStream in = new ByteArrayInputStream("25\n".getBytes());
        System.setIn(in);
        int num = Numero.solicitarNumero();
        assertEquals(25, num);
    }

    @Test
    public void testEsPar() {
        assertTrue(Numero.esPar(2));
        assertFalse(Numero.esPar(3));
    }

    @Test
    public void testMain() {
        ByteArrayInputStream in = new ByteArrayInputStream("2\n".getBytes());
        System.setIn(in);
        Numero.main(new String[]{});
        assertEquals("El número es par\r\n", outputStreamCaptor.toString());
    }
}