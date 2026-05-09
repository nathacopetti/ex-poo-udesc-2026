package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Número da Conta Báncaria: ");
        conta.setNumeroConta(leitor.nextLine());

        System.out.print("Nome do Titular: ");
        conta.setTitular(leitor.nextLine());

        System.out.print("Saldo em Conta: ");
        conta.setSaldo(leitor.nextDouble());

        System.out.printf("Número da Conta Bancária: %s - Nome do Titular: %s - Saldo em Conta: R$ %.2f", conta.getNumeroConta(),
                conta.getTitular(), conta.getSaldo());
    }
}
