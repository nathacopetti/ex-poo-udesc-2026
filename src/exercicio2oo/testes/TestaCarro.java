package exercicio2oo.testes;

import exercicio2oo.classes.Carro;

import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro veiculo = new Carro();

        System.out.print("Modelo: ");
        veiculo.modelo = leitor.nextLine();

        System.out.print("Marca: ");
        veiculo.marca = leitor.nextLine();

        System.out.print("Ano: ");
        veiculo.ano = leitor.nextInt();

        System.out.print("Velocidade: ");
        veiculo.velocidade = leitor.nextDouble();

        System.out.println("\nDados do Carro: ");
        System.out.println("-----------");
        System.out.println("Modelo....: " + veiculo.modelo);
        System.out.println("Marca.....: " + veiculo.marca);
        System.out.println("Ano.......: " + veiculo.ano);
        System.out.println("Velocidade: " + veiculo.velocidade + "km");
    }
}
