package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Largura: ");
        retangulo.largura = leitor.nextDouble();

        System.out.print("Altura: ");
        retangulo.altura = leitor.nextDouble();

        System.out.println("\nDados do Retangulo: ");
        System.out.println("-----------");
        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura.: " + retangulo.altura);
    }
}
