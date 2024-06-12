package CLASE24;

import java.time.LocalDateTime;
import java.util.List;

public class MainII {
    public static void main(String[] args) {
        ProgramasManager manager = new ProgramasManager();

        // Ejemplo de uso
        manager.agregarPrograma(LocalDateTime.of(2024, 6, 11, 20, 0), 120, "Programa A", "Descripción del Programa A");
        manager.agregarPrograma(LocalDateTime.of(2024, 6, 11, 22, 0), 90, "Programa B", "Descripción del Programa B");
        manager.agregarPrograma(LocalDateTime.of(2024, 6, 11, 21, 30), 60, "Programa C", "Descripción del Programa C");

        // Ver programas ordenados por hora de inicio
        List<Programa> programas = manager.obtenerProgramasOrdenados();
        for (Programa programa : programas) {
            System.out.println(programa);
        }

        // Obtener hora de transmisión en diferentes zonas horarias para un programa específico
        Programa programaSeleccionado = programas.get(0);
        for (String zonaHoraria : Programa.getZonasHorarias().keySet()) {
            System.out.println(programaSeleccionado.obtenerHoraEnZonaHoraria(zonaHoraria));
        }
    }
}
