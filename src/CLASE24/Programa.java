package CLASE24;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class Programa {
    private static final int DURACION_MINIMA = 15; // Duración mínima de un programa en minutos
    private static final Map<String, String> ZONAS_HORARIAS = new HashMap<>();

    static {
        ZONAS_HORARIAS.put("Sudamérica", String.valueOf(ZoneId.of("America/Santiago")));
        ZONAS_HORARIAS.put("Costa Este EE. UU.", String.valueOf(ZoneId.of("America/New_York")));
        ZONAS_HORARIAS.put("Costa Oeste EE. UU.", String.valueOf(ZoneId.of("America/Los_Angeles")));
        ZONAS_HORARIAS.put("España", String.valueOf(ZoneId.of("Europe/Madrid")));
        ZONAS_HORARIAS.put("Alemania", String.valueOf(ZoneId.of("Europe/Berlin")));
        ZONAS_HORARIAS.put("Sudáfrica", String.valueOf(ZoneId.of("Africa/Johannesburg")));
        ZONAS_HORARIAS.put("Israel", String.valueOf(ZoneId.of("Asia/Jerusalem")));
        ZONAS_HORARIAS.put("Hong Kong", String.valueOf(ZoneId.of("Asia/Hong_Kong")));
        ZONAS_HORARIAS.put("Japón", String.valueOf(ZoneId.of("Asia/Tokyo")));
        ZONAS_HORARIAS.put("Australia", String.valueOf(ZoneId.of("Australia/Sydney")));
        ZONAS_HORARIAS.put("Nueva Zelanda", String.valueOf(ZoneId.of("Pacific/Auckland")));
    }

    public static Map<String, String> getZonasHorarias() {
        return ZONAS_HORARIAS;
    }

    private final LocalDateTime horaInicio;
    private final LocalDateTime horaFin;
    private final String nombre;
    private final String descripcion;

    public Programa(LocalDateTime horaInicio, int duracionMinutos, String nombre, String descripcion) {
        this.horaInicio = horaInicio;
        this.horaFin = horaInicio.plusMinutes(Math.max(duracionMinutos, DURACION_MINIMA));
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public Duration getDuracion() {
        return Duration.between(horaInicio, horaFin);
    }

    public String toString() {
        return "Nombre: " + nombre +
                ", Descripción: " + descripcion +
                ", Hora de inicio (UTC): " + horaInicio +
                ", Hora de fin (UTC): " + horaFin +
                ", Duración: " + getDuracion().toMinutes() + " minutos";
    }

    public String obtenerHoraEnZonaHoraria(String zonaHoraria) {
        ZoneId zona = ZoneId.of(ZONAS_HORARIAS.get(zonaHoraria));
        LocalDateTime horaInicioLocal = horaInicio.atZone(ZoneId.of("UTC")).withZoneSameInstant(zona).toLocalDateTime();
        LocalDateTime horaFinLocal = horaFin.atZone(ZoneId.of("UTC")).withZoneSameInstant(zona).toLocalDateTime();
        return "Hora de inicio en " + zonaHoraria + ": " + horaInicioLocal + ", Hora de fin en " + zonaHoraria + ": " + horaFinLocal;
    }
}
