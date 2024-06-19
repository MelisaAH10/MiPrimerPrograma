package CLASE27;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        GestorDeContactos gestor = new GestorDeContactos();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar contacto a ArrayList");
            System.out.println("2. Eliminar contacto de ArrayList");
            System.out.println("3. Agregar contacto a HashSet");
            System.out.println("4. Eliminar contacto de HashSet");
            System.out.println("5. Mostrar contactos de ArrayList");
            System.out.println("6. Mostrar contactos de HashSet");
            System.out.println("7. Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                case "3":
                    System.out.println("Ingrese el nombre del contacto:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el número de teléfono del contacto:");
                    String telefono = scanner.nextLine();
                    System.out.println("Ingrese el correo electrónico del contacto:");
                    String correoElectronico = scanner.nextLine();
                    Contacto contacto = new Contacto(nombre, telefono, correoElectronico);
                    if (opcion.equals("1")) {
                        gestor.agregarContactoArrayList(contacto);
                        gestor.mostrarContactosArrayList();
                    } else {
                        gestor.agregarContactoHashSet(contacto);
                        gestor.mostrarContactosHashSet();
                    }
                    break;
                case "2":
                case "4":
                    System.out.println("Ingrese el nombre del contacto a eliminar:");
                    nombre = scanner.nextLine();
                    contacto = new Contacto(nombre, "", ""); // solo necesitamos el nombre para la eliminación
                    if (opcion.equals("2")) {
                        gestor.eliminarContactoArrayList(contacto);
                        gestor.mostrarContactosArrayList();
                    } else {
                        gestor.eliminarContactoHashSet(contacto);
                        gestor.mostrarContactosHashSet();
                    }
                    break;
                case "5":
                    gestor.mostrarContactosArrayList();
                    break;
                case "6":
                    gestor.mostrarContactosHashSet();
                    break;
            }
        } while (!opcion.equals("7"));
    }
}
