package CLASE29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFigurasTest {

    CalculadoraFiguras calculadora = new CalculadoraFiguras();

    @Test
    public void testCalcularPerimetroCirculo() {
        assertEquals(2 * Math.PI * 5, calculadora.calcularPerimetroCirculo(5));
    }

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(Math.PI * Math.pow(5, 2), calculadora.calcularAreaCirculo(5));
    }

    @Test
    public void testCalcularPerimetroTriangulo() {
        assertEquals(3 + 4 + 5, calculadora.calcularPerimetroTriangulo(3, 4, 5));
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals((3 * 4) / 2, calculadora.calcularAreaTriangulo(3, 4));
    }

    @Test
    public void testCalcularPerimetroParalelogramo() {
        assertEquals(2 * (3 + 4), calculadora.calcularPerimetroParalelogramo(3, 4));
    }

    @Test
    public void testCalcularAreaParalelogramo() {
        assertEquals(3 * 4, calculadora.calcularAreaParalelogramo(3, 4));
    }
}