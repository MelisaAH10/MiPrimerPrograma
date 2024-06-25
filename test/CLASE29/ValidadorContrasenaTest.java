package CLASE29;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorContrasenaTest {

        ValidadorContrasena validador = new ValidadorContrasena();

        @Test
        public void testEsSegura() {
            assertTrue(validador.esSegura("Abc123!@#"));
            assertFalse(validador.esSegura("password123"));
        }

        @Test
        public void testTieneLongitudCorrecta() {
            assertTrue(validador.tieneLongitudCorrecta("Abc123!@#"));
            assertFalse(validador.tieneLongitudCorrecta("Abc1!@"));
        }

        @Test
        public void testTieneMayuscula() {
            assertTrue(validador.tieneMayuscula("Abc123!@#"));
            assertFalse(validador.tieneMayuscula("abc123!@#"));
        }

        @Test
        public void testTieneMinuscula() {
            assertTrue(validador.tieneMinuscula("Abc123!@#"));
            assertFalse(validador.tieneMinuscula("ABC123!@#"));
        }

        @Test
        public void testTieneNumero() {
            assertTrue(validador.tieneNumero("Abc123!@#"));
            assertFalse(validador.tieneNumero("Abcdef!@#"));
        }

        @Test
        public void testTieneCaracterEspecial() {
            assertTrue(validador.tieneCaracterEspecial("Abc123!@#"));
            assertFalse(validador.tieneCaracterEspecial("Abc123456"));
        }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/password.csv", numLinesToSkip = 1)
    public void testLogin(String user, String pass) {
        assertNotNull(user);
        assertNotNull(pass);
        assertTrue(pass.matches(".*[A-Z].*") && pass.matches(".*[0-9].*"));
    }


    @ParameterizedTest
    @CsvSource({
            "fabri,P4ss,fa@bri.com,30",
            "pablo,Segura321,pablin@pablon.con, 18",
            "joha,Perro123456789, joha@coach.egg, 26"
    })
    public void testLogin2(String user, String pass, String email, int age) {
        assertNotNull(user);
        assertNotNull(pass);
        assertTrue(pass.matches(".*[A-Z].*") && pass.matches(".*[0-9].*"));
        assertTrue(email.contains("@") && email.contains("."));
        assertTrue(age >= 18 && age <= 99);


    }


    @ParameterizedTest
    @MethodSource("validator")
    void logintest3(String credentials) {
        assertNotNull(credentials);
        System.out.println(credentials);
    }


    static String[] validator() {
        String user = "Fabri";
        String pass = "Ins36ur4";
        return new String[] { user, pass };
    }


    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 })
    void testEsPrimo(int number) {
        assertTrue(esPrimo(number), "El número no es primo");
    }


    static boolean esPrimo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}



