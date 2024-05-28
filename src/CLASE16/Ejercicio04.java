package CLASE16;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de lados: ");
        int a = scanner.nextInt();
        if(a <= 0){
            System.out.println("el size del lado deber ser un numero positivo.");
        }else{
            for (int i = 0; i < a; i++) {
                for(int b = 0; b < a; b++){
                    if(i == 0|| i == a - 1 || b == 0|| b == a -1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
