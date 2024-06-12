package CLASE24;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramasManager {
    private final List<Programa> programas;

    public ProgramasManager() {
        programas = new ArrayList<>();
    }

    public void agregarPrograma(LocalDateTime horaInicio, int duracionMinutos, String nombre, String descripcion) {
        Programa nuevoPrograma = new Programa(horaInicio, duracionMinutos, nombre, descripcion);
        if (!haySuperposicion(nuevoPrograma)) {
            programas.add(nuevoPrograma);
        } else {
            System.out.println("¡El programa se superpone con otro! Por favor, elige otro horario.");
        }
    }

    private boolean haySuperposicion(Programa nuevoPrograma) {
        for (Programa programa : programas) {
            if (nuevoPrograma.getHoraInicio().isBefore(programa.getHoraFin()) &&
                    nuevoPrograma.getHoraFin().isAfter(programa.getHoraInicio())) {
                return true;
            }
        }
        return false;
    }

    public List<Programa> obtenerProgramasOrdenados() {
        List<Programa> programasOrdenados = new ArrayList<>(programas);
        programasOrdenados.sort(Comparator.comparing(Programa::getHoraInicio));
        return programasOrdenados;
    }
}
