package CLASE28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {
    /*
     * Clase Ejercicio1Test: Incluye los test de los metódos de su clase de
     * referencia, en este caso
     * Clase "Ejercicio1"
     */
    @Test
    // Anotación que indica que este método es del tipo "Test"
    void testDoble() {
/*Invocamos al método, enviando un número ya que es el parametro que espera.

Almaceno en una variable, el resultado de ejecutar el metodo*/
        Integer resultado = Ejercicio1.doble(3);

/*Recordar: LADO IZQUIERDO DATO ESPERADO, lo que sabemos que debe

conseguirse. LADO DERECHO resultado obtenido en la ejecucion del metodo.*/

        Assertions.assertEquals(6, resultado); //Yo se, con antelacion, que el doble de 3 es 6.
    }

}