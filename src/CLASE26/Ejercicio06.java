package CLASE26;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {
    private static ArrayList<Tarea> tareas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void agregarTarea() {
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();
        tareas.add(new Tarea(descripcion));
    }

    public static void marcarTareaComoCompletada() {
        System.out.println("Ingrese el id de la tarea a completar:");
        int idTarea = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        for (Tarea tarea : tareas) {
            if (tarea.getIdTarea() == idTarea) {
                tarea.setEstado("completada");
                return;
            }
        }
        System.out.println("La tarea no existe.");
    }

    public static void eliminarTarea() {
        System.out.println("Ingrese el id de la tarea a eliminar:");
        int idTarea = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        tareas.removeIf(tarea -> tarea.getIdTarea() == idTarea);
    }

    public static void mostrarTareasPendientes() {
        for (Tarea tarea : tareas) {
            if (tarea.getEstado().equals("pendiente")) {
                System.out.println(tarea);
            }
        }
    }

    public static void mostrarTareasCompletadas() {
        for (Tarea tarea : tareas) {
            if (tarea.getEstado().equals("completada")) {
                System.out.println(tarea);
            }
        }
    }

    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Mostrar tareas completadas");
            System.out.println("6. Salir");

            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    agregarTarea();
                    break;
                case "2":
                    marcarTareaComoCompletada();
                    break;
                case "3":
                    eliminarTarea();
                    break;
                case "4":
                    mostrarTareasPendientes();
                    break;
                case "5":
                    mostrarTareasCompletadas();
                    break;
            }
        } while (!opcion.equals("6"));
    }
}
