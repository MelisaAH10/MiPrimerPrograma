package CLASE26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int grade;
        String continueAdding;


        do {
            System.out.println("Ingrese una nota entre 1 y 10:");
            grade = scanner.nextInt();
            if (grade >= 1 && grade <= 10) {
                grades.add(grade);
            } else {
                System.out.println("La nota ingresada no está en el rango permitido. Intente de nuevo.");
            }


            System.out.println("¿Desea agregar otra nota? (s/n)");
            continueAdding = scanner.next();
        } while (continueAdding.equalsIgnoreCase("s"));


        Collections.sort(grades, Collections.reverseOrder());


        System.out.println("Las notas ingresadas en orden descendente son:");
        for (int gradeValue : grades) {
            System.out.println(gradeValue);
        }


        Collections.sort(grades);


        System.out.println("Las notas ingresadas en orden ascendente son:");
        for (int gradeValue : grades) {
            System.out.println(gradeValue);
        }
    }
}

