package CLASE18;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Double> notas = new ArrayList<Double>();

        int opcion = 0;
        do{
            try{
                System.out.println("\n MENÚ DE OPCIONES: ");
                System.out.println("1. Registrar Alumnos ");
                System.out.println("2. Mostrar todos los alumnos ");
                System.out.println("3. Mostrar promedios de notas ");
                System.out.println("4. Buscar alumno por nombre ");
                System.out.println("5. Modificar nota por nombre ");
                System.out.println("6. Eliminar alumno por nombre ");
                System.out.println("7. Salir ");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        if (nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacío");
                            break;
                        }

                        System.out.println("Ingrese la nota del alumno: ");
                        double nota = scanner.nextDouble();
                        scanner.nextLine();
                        if (nota < 0.0 || nota > 10.0) {
                            System.out.println("La nota debe estar entre 0.0 y 10.0");
                            break;
                        }

                        nombres.add(nombre);
                        notas.add(nota);

                        System.out.println("Alumno registrado correctamente");

                        break;

                    case 2:

                        if (nombres.isEmpty()) {
                            System.out.println("No hay alumnos registrados");
                            break;
                        } else{
                            System.out.println("Listado de alumnos: ");
                            for (int i = 0; i < nombres.size(); i++) {
                                System.out.println(nombres.get(i) + " - " + notas.get(i));
                            }
                            break;
                        }

                    case 3:
                        double suma = 0;
                        for (int i = 0; i < notas.size(); i++) {
                            suma += notas.get(i); // suma = suma + notas.get(i);
                        }

                        try{
                            double promedio = suma / notas.size();
                            System.out.println("El promedio de notas es: " + promedio);
                        }catch(ArithmeticException e){
                            System.out.println("No se puede dividir por cero");
                        }

                        break;

                    case 4:
                        System.out.println("Ingresa el nombre del alumno a buscar: ");
                        String nombreBuscar = scanner.nextLine();

                        boolean encontrado = false;
                        for(int i = 0; i < nombres.size(); i++){
                            if (nombres.get(i).equals(nombreBuscar)) {
                                System.out.println("El alumno " + nombreBuscar + " tiene una nota de " + notas.get(i));
                                encontrado = true;
                            }

                        }
                        if (!encontrado) {
                            System.out.println("El alumno no se encuentra registrado");
                        }

                        break;

                    case 5:
                        System.out.println("Ingresa el nombre del alumno: ");
                        String nombrenew = scanner.nextLine();

                        for(int i = 0; i < nombres.size(); i++){
                            if (nombres.get(i).equals(nombrenew)) {
                                System.out.println("Ingrese la nueva nota: ");
                                double notanew = scanner.nextDouble();
                                scanner.nextLine();

                                if (notanew < 0.0 || notanew > 10.0) {
                                    System.out.println("La nota debe estar entre 0.0 y 10.0");
                                    break;
                                }
                                notas.set(i, notanew);

                                System.out.println("La nueva nota es: " + notanew);
                                break;
                            }else {
                                System.out.println("El alumno no se encuentra registrado");
                                break;
                            }
                        }

                        break;
                    case 6:
                        System.out.println("Ingresa el nombre del alumno: ");
                        String nombredel = scanner.nextLine();

                        for(int i = 0; i < nombres.size(); i++){
                            if (nombres.get(i).equals(nombredel)) {
                                nombres.remove(i);
                                notas.remove(i);
                                System.out.println("El alumno ha sido eliminado");
                                break;
                            }else{
                                System.out.println("El alumno no se encuentra registrado");
                                break;
                            }
                        }

                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }catch(Exception e){
                System.out.println("Debe ingresar un número");
                scanner.nextLine();
                continue;
            }

        }while(opcion != 7);

        scanner.close();
    }
}
