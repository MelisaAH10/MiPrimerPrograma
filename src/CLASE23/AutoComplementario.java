package CLASE23;

import java.util.Scanner;

public class AutoComplementario {
    private String marca;
    private String modelo;
    private int ano;

    public AutoComplementario(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public AutoComplementario(String marca, String modelo) {
        this(marca, modelo, 0);
    }

    public AutoComplementario(String marca) {
        this(marca, "Modelo desconocido", 0);
    }

    public AutoComplementario() {
        this("Marca desconocida", "Modelo desconocido", 0);
    }

    public void imprimirDatos() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.ano);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutoComplementario auto = null;

        while (true) {
            System.out.println("1. Crear auto con marca, modelo y año");
            System.out.println("2. Crear auto con marca y modelo");
            System.out.println("3. Crear auto con solo marca");
            System.out.println("4. Crear auto sin datos");
            System.out.println("5. Imprimir datos del auto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.next();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.next();
                    System.out.print("Ingrese el año: ");
                    int ano = scanner.nextInt();
                    auto = new AutoComplementario(marca, modelo, ano);
                    break;
                case 2:
                    System.out.print("Ingrese la marca: ");
                    marca = scanner.next();
                    System.out.print("Ingrese el modelo: ");
                    modelo = scanner.next();
                    auto = new AutoComplementario(marca, modelo);
                    break;
                case 3:
                    System.out.print("Ingrese la marca: ");
                    marca = scanner.next();
                    auto = new AutoComplementario(marca);
                    break;
                case 4:
                    auto = new AutoComplementario();
                    break;
                case 5:
                    if (auto != null) {
                        auto.imprimirDatos();
                    } else {
                        System.out.println("No se ha creado ningún auto.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
