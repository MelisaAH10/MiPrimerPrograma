package CLASE28;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ImprimirNYEV2Test {
    private InputStream standarIn = System.in;
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);

        System.setIn(standarIn);
    }
    @Test
    void testMain() {
        int edadPrueba = 70;
        String nombrePrueba = "Pedro";
        ByteArrayInputStream in = new ByteArrayInputStream((nombrePrueba + "\n" + edadPrueba + "\n").getBytes());
        System.setIn(in);
        ImprimirNYEV2.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        System.setOut(standarOut);
        assertEquals("Me llamo " + nombrePrueba + " y tengo " + edadPrueba + " años\r\n", salida);
    }

    @Test
    void testObtenerEdad() {

        ByteArrayInputStream in = new

                ByteArrayInputStream("70\n".getBytes());

        System.setIn(in);
        Integer edadI = ImprimirNYEV2.obtenerEdad(new Scanner(System.in));
        Assertions.assertEquals(70, edadI);
    }
    @Test
    void testObtenerNombre() {

        ByteArrayInputStream in = new

                ByteArrayInputStream("Pedro\n".getBytes());

        System.setIn(in);
        String nombreI = ImprimirNYEV2.obtenerNombre(new Scanner(System.in));
        Assertions.assertEquals("Pedro", nombreI);
    }
}

