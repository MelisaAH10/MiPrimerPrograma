package CLASE29;

public class CalculadoraFiguras {

    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularPerimetroParalelogramo(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }

    public double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
}
