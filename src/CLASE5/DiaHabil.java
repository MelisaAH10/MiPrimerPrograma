package CLASE5;

import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número del 1 al 7 para seleccionar un día de la semana:");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("El día seleccionado es un día hábil.");
                break;
            case 6:
            case 7:
                System.out.println("El día seleccionado no es un día hábil.");
                break;
            default:
                System.out.println("Has ingresado un número inválido. Por favor, ingresa un número del 1 al 7.");
                break;
        }

        scanner.close();
    }
}
