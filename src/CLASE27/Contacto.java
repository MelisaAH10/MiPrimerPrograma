package CLASE27;

public class Contacto {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    public Contacto(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return nombre.equals(contacto.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Telefono: " + telefono + ", Correo Electronico: " + correoElectronico;
    }
}
