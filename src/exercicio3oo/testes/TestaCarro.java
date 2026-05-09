package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

import java.util.Scanner;

public class TestaCarro {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro veiculo = new Carro();

        System.out.print("Modelo: ");
        veiculo.setModelo(leitor.nextLine());

        System.out.print("Marca: ");
        veiculo.setMarca(leitor.nextLine());

        System.out.print("Ano: ");
        veiculo.setAno(leitor.nextInt());

        System.out.print("Velocidade: ");
        veiculo.setVelocidade(leitor.nextDouble());

        System.out.printf("Modelo: %s - Marca: %s - Ano: %d - Velocidade: %.2f", veiculo.getModelo(), veiculo.getMarca(),
                veiculo.getAno(), veiculo.getVelocidade());
    }
}
