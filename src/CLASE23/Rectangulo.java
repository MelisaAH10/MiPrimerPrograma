package CLASE23;

import java.util.Scanner;

public class Rectangulo {
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirArea() {
        System.out.println("El área del rectángulo es: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + perimetro());
    }

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("***Team 14 - EGG***");
            Scanner scanner = new Scanner(System.in);
            Rectangulo[] rectangulos = new Rectangulo[10]; // Capacidad máxima de 100 rectángulos
            int contador = 0;
            boolean salir = false;


            while (!salir) {
                System.out.println("Menú de opciones:");
                System.out.println("1. Crear Rectángulo");
                System.out.println("2. Calcular y mostrar área de un Rectángulo");
                System.out.println("3. Calcular y mostrar perímetro de un Rectángulo");
                System.out.println("4. Mostrar número total de Rectángulos creados");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");


                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea


                switch (opcion) {
                    case 1:
                        if (contador < rectangulos.length) {
                            System.out.print("Ingrese el ancho del rectángulo: ");
                            double ancho = scanner.nextDouble();
                            System.out.print("Ingrese el alto del rectángulo: ");
                            double alto = scanner.nextDouble();
                            rectangulos[contador] = new Rectangulo(ancho, alto);
                            contador++;
                            System.out.println("Rectángulo creado exitosamente.");
                        } else {
                            System.out.println("No se pueden crear más rectángulos. Capacidad máxima alcanzada.");
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese el índice del rectángulo para calcular el área: ");
                        int indiceArea = scanner.nextInt();
                        if (indiceArea >= 0 && indiceArea < contador) {
                            rectangulos[indiceArea].imprimirArea();
                        } else {
                            System.out.println("Índice no válido.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el índice del rectángulo para calcular el perímetro: ");
                        int indicePerimetro = scanner.nextInt();
                        if (indicePerimetro >= 0 && indicePerimetro < contador) {
                            rectangulos[indicePerimetro].imprimirPerimetro();
                        } else {
                            System.out.println("Índice no válido.");
                        }
                        break;
                    case 4:
                        System.out.println("Número total de rectángulos creados: " + Rectangulo.getContadorRectangulos());
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                System.out.println(); // Salto de línea para separar las opciones
            }
            scanner.close();
        }
    }
}
