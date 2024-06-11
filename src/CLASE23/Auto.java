package CLASE23;

public class Auto {
    private String marca;
    private String modelo;
    private int ano;

    public Auto(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {
    }

    public void imprimirDatos() {
        if (marca != null) {
            System.out.println("Marca: " + this.marca);
        }
        if (modelo != null) {
            System.out.println("Modelo: " + this.modelo);
        }
        if (ano != 0) {
            System.out.println("Año: " + this.ano);
        }
        if (marca == null && modelo == null && ano == 0) {
            System.out.println("El auto no ha sido inicializado.");
        }
    }
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2020);
        auto1.imprimirDatos();

        Auto auto2 = new Auto("Honda", "Civic");
        auto2.imprimirDatos();

        Auto auto3 = new Auto("Ford");
        auto3.imprimirDatos();

        Auto auto4 = new Auto();
        auto4.imprimirDatos();
    }
}
