package exercicio3oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    //Metodos getters
    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    //Metodos setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}
