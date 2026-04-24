package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Raio: ");
        circulo.raio = leitor.nextDouble();

        System.out.println("\nDados do Círculo: ");
        System.out.println("-----------");
        System.out.println("Raio: " + circulo.raio);
    }
}
