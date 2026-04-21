package exercicio1oo.classes;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Número da Conta Báncaria: ");
        conta.numeroConta = leitor.nextLine();

        System.out.print("Nome do Titular: ");
        conta.titular = leitor.nextLine();

        System.out.print("Saldo em Conta: ");
        conta.saldo = leitor.nextDouble();

        System.out.println("\nDados da Conta Bancária: ");
        System.out.println("------------");
        System.out.println("Número da Conta Bancária: " + conta.numeroConta);
        System.out.println("Titular.................: " + conta.titular);
        System.out.println("Saldo...................: R$" + conta.saldo);
    }
}
