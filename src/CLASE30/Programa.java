package CLASE30;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Oracion oracion = new Oracion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Crear/Borrar oración");
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Salir");

            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una oración: ");
                    oracion.setOracion(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("La oración tiene " + oracion.contarCaracteres() + " caracteres");
                    break;
                case 3:
                    System.out.println("La oración tiene " + oracion.contarPalabras() + " palabras");
                    break;
                case 4:
                    System.out.println("Las palabras ordenadas alfabéticamente son: " + oracion.ordenarPalabras());
                    break;
                case 5:
                    System.out.print("Ingrese un número: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("La palabra en la posición " + posicion + " es: " + oracion.obtenerPalabra(posicion));
                    break;
                case 6:
                    System.out.print("Ingrese una palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.println(oracion.buscarPalabra(palabra));
                    break;
                case 7:
                    System.out.print("Ingrese la palabra a modificar: ");
                    String palabraAntigua = scanner.nextLine();
                    System.out.print("Ingrese la nueva palabra: ");
                    String palabraNueva = scanner.nextLine();
                    System.out.println(oracion.modificarPalabra(palabraAntigua, palabraNueva));
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente");

            }
        } while (opcion != 8);

        scanner.close();
    }
}
