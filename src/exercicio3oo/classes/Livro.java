package exercicio3oo.classes;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public boolean getEmprestado() {
        return this.emprestado;
    }

    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }

    public void setAutor(String autor) {
        this.autor= autor;
    }

    public void setGenero(String genero) {
        this.genero= genero;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado= emprestado;
    }

}
