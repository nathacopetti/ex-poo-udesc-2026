package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Largura: ");
        retangulo.setLargura(leitor.nextDouble());

        System.out.print("Altura: ");
        retangulo.setAltura(leitor.nextDouble());

        System.out.printf("Largura: %.2f - Altura: %.2f", retangulo.getLargura(), retangulo.getAltura());
    }
}
