package CLASE30;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Assertions;

public class NumeroAleatorioTest {

    @RepeatedTest(25)
    void testNumeroAleatorio(RepetitionInfo repetitionInfo) {
        NumeroAleatorio generador = new NumeroAleatorio();
        int min = 13;
        int max = 35;
        int numeroAleatorio = generador.numeroAleatorio(min, max);

        // Verificar que el número aleatorio está dentro del rango
        Assertions.assertTrue(numeroAleatorio >= min && numeroAleatorio <= max,
                "El número aleatorio debe estar dentro del rango [" + min + ", " + max + "]");

        // Imprimir la repetición actual
        System.out.println("Repetición actual: " + repetitionInfo.getCurrentRepetition());
    }
}