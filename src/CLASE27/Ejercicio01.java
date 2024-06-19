package CLASE27;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar invitados");
            System.out.println("4. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre del invitado:");
                    String nombre = scanner.nextLine();
                    registro.agregarInvitado(nombre);
                    break;
                case "2":
                    System.out.println("Ingrese el nombre del invitado a eliminar:");
                    nombre = scanner.nextLine();
                    registro.eliminarInvitado(nombre);
                    break;
                case "3":
                    registro.mostrarInvitados();
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
