package CLASE29;

public class Paralelogramo implements FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Paralelogramo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
