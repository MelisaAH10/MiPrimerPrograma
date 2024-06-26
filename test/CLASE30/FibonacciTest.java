package CLASE30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static CLASE30.Fibonacci.fibonacci;

class FibonacciTest {
    @RepeatedTest(15)
    void testFibonacci(RepetitionInfo repetitionInfo) {
            Fibonacci fibonacci = new Fibonacci();
        int posicion = repetitionInfo.getCurrentRepetition();
        int resultado = fibonacci(posicion);

        // Verificar que el resultado es correcto
        if (posicion == 0) {
            Assertions.assertEquals(0, resultado);
        } else if (posicion == 1 || posicion == 2) {
            Assertions.assertEquals(1, resultado);
        } else {
            int fiboPrev1 = fibonacci(posicion - 1);
            int fiboPrev2 = fibonacci(posicion - 2);
            Assertions.assertEquals(fiboPrev1 + fiboPrev2, resultado);
        }
    }
}