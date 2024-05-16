package CLASE9;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura = 0;
        String unit = "";

        boolean validInput;
        do {
            validInput = true;

            System.out.println("Ingrese la temperatura:");
            String tempInput = scanner.nextLine();

            // Validar si la temperatura es un número
            try {
                temperatura = Double.parseDouble(tempInput);
            } catch (NumberFormatException e) {
                System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
                validInput = false;
            }

            if (validInput) {
                System.out.println("Ingrese la unidad de medida (C/F):");
                unit = scanner.nextLine().toUpperCase();

                // Validar la unidad de medida
                if (!unit.equals("C") && !unit.equals("F")) {
                    System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                    validInput = false;
                }
            }
        } while (!validInput);

        // Convertir la temperatura
        if (unit.equals("C")) {
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.printf("%.2f grados Fahrenheit equivale a %.2f grados Celsius.\n", temperatura, celsius);
        } else {
            double fahrenheit = (temperatura * 9 / 5) + 32;
            System.out.printf("%.2f grados Celsius equivale a %.2f grados Fahrenheit.\n", temperatura, fahrenheit);
        }

        scanner.close();
    }
}
