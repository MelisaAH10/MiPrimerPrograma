package CLASE26;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
    public static ArrayList<Estudiante> estudiantes;
    public static Scanner scanner;


    public static void main(String[] args) {
        estudiantes = new ArrayList<>();
        scanner = new Scanner(System.in);

        String opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Salir");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    agregarEstudiante();
                    break;
                case "2":
                    eliminarEstudiante();
                    break;
                case "3":
                    mostrarEstudiantes();
                    break;
                case "4":
                    buscarEstudiante();
                    break;
            }
        } while (!opcion.equals("5"));
    }

    public static void agregarEstudiante() {
        System.out.println("Ingrese el documento del estudiante:");
        String documento = scanner.nextLine();
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        Integer edad = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        estudiantes.add(new Estudiante(documento, nombre, edad));
    }

    public static void eliminarEstudiante() {
        System.out.println("Ingrese el documento del estudiante a eliminar:");
        String documento = scanner.nextLine();
        estudiantes.removeIf(estudiante -> estudiante.getDocumento().equals(documento));
    }

    public static void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void buscarEstudiante() {
        System.out.println("Ingrese el documento del estudiante a buscar:");
        String documento = scanner.nextLine();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getDocumento().equals(documento)) {
                System.out.println(estudiante);
                return;
            }
        }
        System.out.println("El estudiante no está registrado.");
    }

}
