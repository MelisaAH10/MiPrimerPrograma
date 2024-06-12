package CLASE24;

public class Circulo {
    private double radio;

    public Circulo() {
        // Constructor sin parámetros
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public void imprimirDatos() {
        System.out.println("Círculo: radio = " + radio);
    }
}
