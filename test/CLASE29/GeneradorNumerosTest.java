package CLASE29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void testNumeroAleatorio() {
        int numero = GeneradorNumeros.numeroAleatorio();
        assertTrue(numero >= 1 && numero <= 355);

        String salida = outputStreamCaptor.toString().trim();
        assertEquals(String.valueOf(numero), salida);
    }
}