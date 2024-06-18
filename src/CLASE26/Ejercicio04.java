package CLASE26;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        ArrayList<Integer> turnNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueAdding;
        int turnNumber = 1;


        do {
            System.out.println("Cliente llegó. Número de turno asignado: " + turnNumber);
            turnNumbers.add(turnNumber);
            turnNumber++;


            System.out.println("¿Llegó otro cliente? (s/n)");
            continueAdding = scanner.nextLine();
        } while (continueAdding.equalsIgnoreCase("s"));


        int randomTurn = random.nextInt(turnNumbers.size()) + 1;
        System.out.println("Número de turno seleccionado en el sorteo: " + randomTurn);


        if (turnNumbers.contains(randomTurn)) {
            System.out.println("El cliente con el número de turno " + randomTurn + " será atendido de inmediato.");
            turnNumbers.remove(Integer.valueOf(randomTurn));
        } else {
            System.out.println("El número de turno seleccionado en el sorteo no existe.");
        }


        System.out.println("Orden de atención de los clientes:");
        for (int number : turnNumbers) {
            System.out.println("Turno número: " + number);
        }
    }
}

