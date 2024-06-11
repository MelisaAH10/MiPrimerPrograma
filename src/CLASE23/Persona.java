package CLASE23;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30);
        persona1.imprimirDatos();

        Persona persona2 = new Persona("Ana", 25);
        persona2.imprimirDatos();
    }
}
