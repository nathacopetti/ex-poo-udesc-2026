package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Raio: ");
        circulo.setRaio(leitor.nextDouble());

        System.out.printf("Raio: %.2f", circulo.getRaio());
    }
}
