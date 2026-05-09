package exercicio3oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta= numeroConta;
    }

    public void setTitular(String titular) {
        this.titular= titular;
    }

    public void setSaldo (double saldo) {
        this.saldo= saldo;
    }

}
