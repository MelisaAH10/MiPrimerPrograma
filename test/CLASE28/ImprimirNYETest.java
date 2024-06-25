package CLASE28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ImprimirNYETest {
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
    }
    @Test
    void testMain() {
        ImprimirNYE.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        assertEquals("Me llamo Pedro y tengo 70 años\r\n", salida);
    }

}