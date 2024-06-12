package CLASE24;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcion2;
        do {
            System.out.println("Seleccione la figura geométrica que desea crear:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Rectángulo");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);

                    System.out.println("Menú de opciones: ");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular perímetro");
                    System.out.println("3. Imprimir datos");
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Área del círculo: " + circulo.area());
                            break;
                        case 2:
                            System.out.println("Perímetro del círculo: " + circulo.perimetro());
                            break;
                        case 3:
                            circulo.imprimirDatos();
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);

                    System.out.println("Menú de opciones: ");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Imprimir datos");
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Área del triangulo: " + triangulo.area());
                            break;
                        case 2:
                            triangulo.imprimirDatos();
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);

                    System.out.println("Menú de opciones: ");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular perímetro");
                    System.out.println("3. Imprimir datos");
                    opcion2 = scanner.nextInt();

                    switch (opcion2) {
                        case 1:
                            System.out.println("Área del rectangulo: " + rectangulo.area());
                            break;
                        case 2:
                            System.out.println("Perímetro del rectangulo: " + rectangulo.perimetro());
                            break;
                        case 3:
                            rectangulo.imprimirDatos();
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }

                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
