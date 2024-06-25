package CLASE29;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClasificacionTest {

    private static Stream<Arguments> provideScoresForTest() {
        return Stream.of(
                Arguments.of(95, "A"),
                Arguments.of(85, "B"),
                Arguments.of(75, "C"),
                Arguments.of(65, "D"),
                Arguments.of(55, "F"),
                Arguments.of(105, ": Error - El número ingresado está fuera del rango válido."),
                Arguments.of(-5, ": Error - El número ingresado está fuera del rango válido.")
        );
    }

    @ParameterizedTest
    @MethodSource("provideScoresForTest")
    public void testObtenerNota(int score, String expectedGrade) {
        assertEquals(expectedGrade, Clasificacion.obtenerNota(score));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/csv/mensaje-puntuacion.csv", numLinesToSkip = 1)
    void testMensajePuntuacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado = Clasificacion.mensajePuntuacion(puntuacionIngresada);
        assertEquals(valorEsperado, resultado);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/puntuacion-calificacion.csv", numLinesToSkip = 1)
    void testObtenerClasificacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado = Clasificacion.obtenerNota(puntuacionIngresada);
        assertEquals(valorEsperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({"'92\n',92", "'80\n',80"})
    void testObtenerPuntuacion(String input, Integer valorEsperado) throws IOException {
        try (ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes())) {
            System.setIn(in);

            Clasificacion.scanner = new Scanner(System.in);
            Integer resultado = Clasificacion.obtenerPuntuacion();
            assertEquals(valorEsperado, resultado);
        }
    }
}