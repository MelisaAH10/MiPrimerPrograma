package CLASE24;

import java.util.Scanner;
import CLASE24.Punto;

import static CLASE24.Punto.calcularDistancia;

public class Ejercicio02 {
    private static Punto[] puntos = new Punto[3]; // Arreglo de objetos Punto
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1. Crear un punto");
            System.out.println("2. Calcular distancia desde el origen");
            System.out.println("3. Calcular distancia entre dos puntos");
            System.out.println("4. Verificar si tres puntos están alineados");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la coordenada x del punto: ");
                    double x = scanner.nextDouble();
                    System.out.print("Ingrese la coordenada y del punto: ");
                    double y = scanner.nextDouble();
                    Punto nuevoPunto = new Punto(x, y);
                    int puntosCreados = 0;
                    for (Punto punto : puntos) {
                        if (punto != null) {
                            puntosCreados++;
                        }
                    }

                    if (puntosCreados < puntos.length) {
                        for (int i = 0; i < puntos.length; i++) {
                            if (puntos[i] == null) {
                                puntos[i] = nuevoPunto;
                                System.out.println("Punto creado en la posición: " + i);
                                break;
                            }
                        }
                    } else {
                        System.out.println("No se pueden crear más puntos. Ya se han creado " + puntosCreados + " puntos.");
                    }
                    break;
                case 2:
                    if (puntosVacios()) {
                        System.out.println("No hay puntos creados aún.");
                    } else {
                        System.out.print("Ingrese el índice del punto: ");
                        int indice = scanner.nextInt();
                        if (indice < 0 || indice >= puntos.length) {
                            System.out.println("Índice inválido. Debe estar entre 0 y " + (puntos.length - 1));
                        } else {
                            Punto punto = puntos[indice];
                            double distancia = punto.distanciaDesdeOrigen();
                            System.out.println("La distancia desde el origen es: " + distancia);
                        }
                    }
                    break;
                case 3:
                    if (puntosVacios()) {
                        System.out.println("No hay puntos creados aún.");
                    } else {
                        System.out.print("Ingrese el índice del primer punto (0-2): ");
                        int indice1 = scanner.nextInt();
                        System.out.print("Ingrese el índice del segundo punto (0-2): ");
                        int indice2 = scanner.nextInt();
                        Punto punto1 = puntos[indice1];
                        Punto punto2 = puntos[indice2];
                        double distancia = Punto.calcularDistancia(punto1, punto2);
                        System.out.println("La distancia entre los dos puntos es: " + distancia);
                    }
                    break;
                case 4:
                    if (puntosVacios()) {
                        System.out.println("No hay puntos creados aún.");
                    } else {
                        Punto punto1 = puntos[0];
                        Punto punto2 = puntos[1];
                        Punto punto3 = puntos[2];
                        if (punto1 != null && punto2 != null && punto3 != null) {
                            boolean estanAlineados = Punto.estanAlineados(punto1, punto2, punto3);
                            if (estanAlineados) {
                                System.out.println("Los puntos están alineados.");
                            } else {
                                System.out.println("Los puntos no están alineados.");
                            }
                        } else {
                            System.out.println("Alguno de los puntos no ha sido creado aún.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    private static boolean puntosVacios() {
        for (Punto punto : puntos) {
            if (punto != null) {
                return false;
            }
        }
        return true;
    }
}
