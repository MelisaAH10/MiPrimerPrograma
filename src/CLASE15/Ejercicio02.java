package CLASE15;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidadCalificaciones = 100;

        String[] calificaciones = new String[cantidadCalificaciones];
        ArrayList<Double> desaprobados = new ArrayList<>();
        ArrayList<Double> aprobados = new ArrayList<>();
        ArrayList<Double> excelentes = new ArrayList<>();

        double sumaTotal = 0;

        for (int i = 0; i < cantidadCalificaciones; i++) {
            double calificacion = 1 + random.nextDouble() * 10;
            calificaciones[i] = String.format("%.2f", calificacion);
            sumaTotal += calificacion;

            if (calificacion < 4) {
                desaprobados.add(calificacion);
            } else if (calificacion < 10) {
                aprobados.add(calificacion);
            } else {
                excelentes.add(calificacion);
            }
        }

        double promedioTotal = sumaTotal / cantidadCalificaciones;
        double promedioDesaprobados = desaprobados.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double promedioAprobados = aprobados.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double promedioExcelentes = excelentes.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("Promedio total: " + promedioTotal);
        System.out.println("Promedio desaprobados: " + promedioDesaprobados);
        System.out.println("Promedio aprobados: " + promedioAprobados);
        System.out.println("Promedio excelentes: " + promedioExcelentes);
    }
}
