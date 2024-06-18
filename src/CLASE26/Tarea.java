package CLASE26;

public class Tarea {
    private static int contadorId = 0;
    private int idTarea;
    private String descripcion;
    private String estado;

    public Tarea(String descripcion) {
        this.idTarea = ++contadorId;
        this.descripcion = descripcion;
        this.estado = "pendiente";
    }

    public int getIdTarea() {
        return idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idTarea: " + idTarea + ", Descripcion: " + descripcion + ", Estado: " + estado;
    }
}
