package CLASE30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OracionTest {
    private Oracion oracion;

    @BeforeEach
    public void setUp() {
        oracion = new Oracion();
        oracion.setOracion("Hola mundo");
    }

    @Test
    public void testContarCaracteres() {
        int resultado = oracion.contarCaracteres();
        Assertions.assertEquals(10, resultado);
    }

    @Test
    public void testContarPalabras() {
        int resultado = oracion.contarPalabras();
        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void testOrdenarPalabras() {
        String resultado = oracion.ordenarPalabras();
        Assertions.assertEquals("Hola mundo", resultado);
    }

    @Test
    public void testObtenerPalabra() {
        String resultado = oracion.obtenerPalabra(1);
        Assertions.assertEquals("Hola", resultado);
    }

    @Test
    public void testBuscarPalabra() {
        String resultado = oracion.buscarPalabra("mundo");
        Assertions.assertEquals("La palabra 'mundo' se encuentra en la posición 2", resultado);
    }

    @Test
    public void testModificarPalabra() {
        String resultado = oracion.modificarPalabra("mundo", "todos");
        Assertions.assertEquals("La oración modificada es: Hola todos", resultado);
    }

    @Test
    public void testAgregarContenido() {
        oracion.agregarContenido("a todos");
        Assertions.assertEquals("Hola mundo a todos", oracion.getOracion());
    }
}