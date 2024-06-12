package CLASE24;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas * 7;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public void imprimirDetalles() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
    }
}
