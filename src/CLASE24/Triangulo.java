package CLASE24;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
        // Constructor sin parámetros
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return 0.5 * base * altura;
    }

    public void imprimirDatos() {
        System.out.println("Triángulo: base = " + base + ", altura = " + altura);
    }
}
