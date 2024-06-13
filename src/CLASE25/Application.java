package CLASE25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Esta clase representa la aplicación principal que gestiona a los empleados.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = {}; // Aquí puedes cargar tus empleados
        Empleado[] empleadosOriginales = Arrays.copyOf(empleados, empleados.length);
        int opcion;
        do {
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarTodosLosEmpleados(empleados);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.next();
                    if (existeEmpleadoConMismoNombre(empleados, nombre)) {
                        System.out.println("Ya existe un empleado con ese nombre. Por favor, ingrese un nombre diferente.");
                        break;
                    }
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Ingrese el departamento del empleado: ");
                    String departamento = scanner.next();
                    Empleado nuevoEmpleado = new Empleado();
                    nuevoEmpleado.setNombre(nombre);
                    nuevoEmpleado.setEdad(edad);
                    nuevoEmpleado.setSalario(salario);
                    nuevoEmpleado.setDepartamento(departamento);
                    empleados = Arrays.copyOf(empleados, empleados.length + 1);
                    empleados[empleados.length - 1] = nuevoEmpleado;
                    break;
                case 3:
                    System.out.println("Seleccione el atributo a filtrar:");
                    System.out.println("1. Nombre");
                    System.out.println("2. Edad");
                    System.out.println("3. Salario");
                    System.out.println("4. Departamento");
                    System.out.print("Seleccione una opción: ");
                    int opcionFiltro = scanner.nextInt();
                    Empleado[] empleadosFiltrados = Arrays.copyOf(empleados, empleados.length); // Inicialización
                    if (opcionFiltro == 3 || opcionFiltro == 4) {
                        System.out.print("Ingrese el valor mínimo del filtro: ");
                        double minValorFiltro = scanner.nextDouble();
                        System.out.print("Ingrese el valor máximo del filtro: ");
                        double maxValorFiltro = scanner.nextDouble();
                        switch (opcionFiltro) {
                            case 3:
                                empleadosFiltrados = filtrarEmpleadosPorSalario(empleados, minValorFiltro, maxValorFiltro);
                                break;
                            case 4:
                                empleadosFiltrados = filtrarEmpleadosPorEdad(empleados, (int)minValorFiltro, (int)maxValorFiltro);
                                break;
                        }
                    } else {
                        System.out.print("Ingrese el valor del filtro: ");
                        String valorFiltro = scanner.next();
                        switch (opcionFiltro) {
                            case 1:
                                empleadosFiltrados = filtrarEmpleadosPorNombre(empleados, valorFiltro);
                                break;
                            case 2:
                                empleadosFiltrados = filtrarEmpleadosPorDepartamento(empleados, valorFiltro);
                                break;
                        }
                    }
                    mostrarTodosLosEmpleados(empleadosFiltrados);
                    break;
                case 4:
                    System.out.println("Seleccione el atributo para ordenar:");
                    System.out.println("1. Nombre");
                    System.out.println("2. Edad");
                    System.out.println("3. Salario");
                    System.out.println("4. Departamento");
                    System.out.print("Seleccione una opción: ");
                    int opcionOrden = scanner.nextInt();
                    Empleado[] empleadosOrdenados;
                    switch (opcionOrden) {
                        case 1:
                            empleadosOrdenados = ordenarEmpleadosPorNombre(empleados);
                            break;
                        case 2:
                            empleadosOrdenados = ordenarEmpleadosPorEdad(empleados);
                            break;
                        case 3:
                            empleadosOrdenados = ordenarEmpleadosPorSalario(empleados);
                            break;
                        case 4:
                            empleadosOrdenados = ordenarEmpleadosPorDepartamento(empleados);
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            empleadosOrdenados = empleados;
                            break;
                    }
                    mostrarTodosLosEmpleados(empleadosOrdenados);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del empleado al que desea incrementar el salario: ");
                    String nombreEmpleado = scanner.next();
                    System.out.print("Ingrese el porcentaje de incremento salarial: ");
                    double porcentaje = scanner.nextDouble();
                    Empleado empleado = buscarPorNombre(empleados, nombreEmpleado);
                    if (empleado != null) {
                        incrementarSalario(empleado, porcentaje);
                        System.out.println("Salario incrementado.");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;
                case 6:
                    empleados = Arrays.copyOf(empleadosOriginales, empleadosOriginales.length);
                    System.out.println("Filtros limpiados.");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 7);
    }


    private static Empleado[] filtrarEmpleadosPorDepartamento(Empleado[] empleados, String valorFiltro) {
        return Arrays.stream(empleados)
                .filter(empleado -> empleado.getDepartamento().equals(valorFiltro))
                .toArray(Empleado[]::new);
    }

    private static Empleado[] filtrarEmpleadosPorSalario(Empleado[] empleados, double minSalario, double maxSalario) {
        return Arrays.stream(empleados)
                .filter(empleado -> empleado.getSalario() >= minSalario && empleado.getSalario() <= maxSalario)
                .toArray(Empleado[]::new);
    }

    private static Empleado[] filtrarEmpleadosPorEdad(Empleado[] empleados, int minEdad, int maxEdad) {
        return Arrays.stream(empleados)
                .filter(empleado -> empleado.getEdad() >= minEdad && empleado.getEdad() <= maxEdad)
                .toArray(Empleado[]::new);
    }


    /**
     * Muestra todos los empleados en la consola.
     *
     * @param empleados El arreglo de empleados a mostrar.
     */
    public static void mostrarTodosLosEmpleados(Empleado[] empleados) {
        System.out.printf("%-5s %-15s %-5s %-10s %-15s%n", "No.", "Nombre", "Edad", "Salario", "Departamento");
        for (int i = 0; i < empleados.length; i++) {
            Empleado empleado = empleados[i];
            System.out.printf("%-5d %-15s %-5d %-10.2f %-15s%n", (i + 1), empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getDepartamento());
        }
    }

    /**
     * Filtra los empleados por nombre.
     *
     * @param empleados El arreglo de empleados a filtrar.
     * @param nombre El nombre a usar para el filtro.
     * @return Un nuevo arreglo de empleados que solo contiene a los empleados con el nombre especificado.
     */
    public static Empleado[] filtrarEmpleadosPorNombre(Empleado[] empleados, String nombre) {
        return Arrays.stream(empleados)
                .filter(empleado -> empleado.getNombre().equals(nombre))
                .toArray(Empleado[]::new);
    }

    public static Empleado[] ordenarEmpleadosPorSalario(Empleado[] empleados) {
        return Arrays.stream(empleados)
                .sorted(Comparator.comparingDouble(Empleado::getSalario))
                .toArray(Empleado[]::new);
    }
    public static Empleado[] ordenarEmpleadosPorNombre(Empleado[] empleados) {
        return Arrays.stream(empleados)
                .sorted(Comparator.comparing(Empleado::getNombre))
                .toArray(Empleado[]::new);
    }

    private static Empleado[] ordenarEmpleadosPorDepartamento(Empleado[] empleados) {
        return Arrays.stream(empleados)
                .sorted(Comparator.comparing(Empleado::getDepartamento))
                .toArray(Empleado[]::new);
    }

    private static Empleado[] ordenarEmpleadosPorEdad(Empleado[] empleados) {
        return Arrays.stream(empleados)
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .toArray(Empleado[]::new);
    }

    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        return Arrays.stream(empleados)
                .filter(empleado -> empleado.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }

    public static void incrementarSalario(Empleado empleado, double porcentaje) {
        double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
        empleado.setSalario(nuevoSalario);
    }

    public static boolean existeEmpleadoConMismoNombre(Empleado[] empleados, String nombre) {
        return Arrays.stream(empleados)
                .anyMatch(empleado -> empleado.getNombre().equals(nombre));
    }
}
