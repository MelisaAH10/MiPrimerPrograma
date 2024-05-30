package CLASE17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String oracion = "";
            int opcion;

            do {
                System.out.println("\n1. Crear/Borrar oración");
                System.out.println("2. Cantidad de caracteres de la oración");
                System.out.println("3. Cantidad de palabras de la oración");
                System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
                System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
                System.out.println("6. Buscar palabra dentro de la oración");
                System.out.println("7. Modificar palabra dentro de la oración");
                System.out.println("8. Agregar contenido a la oración");
                System.out.println("9. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                switch (opcion) {
                    case 1:
                        if (oracion.isEmpty()) {
                            System.out.println("Crear oración ");
                            System.out.print("Ingrese una oración: ");
                            oracion = scanner.nextLine();
                        } else {
                            oracion = "";
                            System.out.println("Oración borrada.");
                        }
                        break;
                    case 2:
                        System.out.println("La oración tiene " + oracion.length() + " caracteres.");
                        break;
                    case 3:
                        if (oracion == null || oracion.trim().isEmpty()) {
                            System.out.println("La oración no contiene palabras.");
                        } else {
                            System.out.println("La oración tiene " + oracion.trim().split(" ").length + " palabras.");
                        }
                        break;
                    case 4:
                        String[] palabras = oracion.trim().split(" ");
                        Arrays.sort(palabras);
                        System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(palabras));
                        break;
                    case 5:
                        System.out.print("Ingrese un número: ");
                        int numero = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        String[] palabras2 = oracion.split(" ");
                        if (numero > 0 && numero <= palabras2.length) {
                            System.out.println("La palabra en la posición " + numero + " es " + palabras2[numero - 1]);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese una palabra: ");
                        String palabra = scanner.nextLine();
                        int posicion = oracion.indexOf(palabra);
                        if (posicion != -1) {
                            System.out.println("La palabra '" + palabra + "' fue encontrada en la posición " + (posicion + 1));
                        } else {
                            System.out.println("La palabra '" + palabra + "' no fue encontrada.");
                        }
                        break;
                    case 7:
                        System.out.print("Ingrese la palabra que desea cambiar: ");
                        String palabraAntigua = scanner.nextLine();
                        if (oracion.contains(palabraAntigua)) {
                            System.out.print("Ingrese la nueva palabra: ");
                            String palabraNueva = scanner.nextLine();
                            oracion = oracion.replace(palabraAntigua, palabraNueva);
                            System.out.println("La nueva oración es: " + oracion);
                        } else {
                            System.out.println("La palabra '" + palabraAntigua + "' no fue encontrada.");
                        }
                        break;
                    case 8:
                        System.out.print("Ingrese el contenido que desea agregar: ");
                        String contenido = scanner.nextLine();
                        oracion += " " + contenido;
                        System.out.println("La nueva oración es: " + oracion);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                        break;
                }
            } while (opcion != 9);
        }
    }

