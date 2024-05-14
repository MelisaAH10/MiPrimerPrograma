package CLASE7;

import java.util.Scanner;

public class LongitudCadenaSinEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa una cadena de texto:");
        String cadena = scanner.nextLine();

        int longitudSinEspacios = cadena.replace(" ", "").length();

        System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);

        scanner.close();
    }
}
