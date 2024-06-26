package CLASE29;

import static org.junit.jupiter.api.Assertions.*;

class FiguraGeometricaTest {

        @org.junit.jupiter.api.Test
        void calcularArea() {
            FiguraGeometrica circulo = new Circulo(5);
            assertEquals(Math.PI * Math.pow(5, 2), circulo.calcularArea());
        }

        @org.junit.jupiter.api.Test
        void calcularPerimetro() {
            FiguraGeometrica circulo = new Circulo(5);
            assertEquals(2 * Math.PI * 5, circulo.calcularPerimetro());
        }

}