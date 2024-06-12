package CLASE24;

public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo() {
        // Constructor sin parámetros
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirDatos() {
        System.out.println("Rectángulo: ancho = " + ancho + ", alto = " + alto);
    }
}