package CLASE26;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String city;
        String continueAdding;


        do {
            System.out.println("Ingrese el nombre de una ciudad:");
            city = scanner.nextLine();
            cities.add(city);


            System.out.println("¿Desea agregar otra ciudad? (s/n)");
            continueAdding = scanner.nextLine();
        } while (continueAdding.equalsIgnoreCase("s"));


        System.out.println("Las ciudades ingresadas son:");
        for (String cityName : cities) {
            System.out.println(cityName);
        }
    }
}

