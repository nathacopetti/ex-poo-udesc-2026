package exercicio1oo.classes;

import java.util.Scanner;  ///include do C

public class TestaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno fulano =  new Aluno(); //criar objeto

        System.out.print("Nome: ");
        fulano.nome = leitor.nextLine(); /// ler string nextLine

        System.out.print("Matricula: ");
        fulano.matricula = leitor.nextLine(); /// ler string nextLine

        System.out.print("Idade: ");
        fulano.idade = leitor.nextInt(); /// ler int

        System.out.print("Nota 1: ");
        fulano.nota1 = leitor.nextInt();

        System.out.print("Nota 2: ");
        fulano.nota2 = leitor.nextInt();

        System.out.print("Nota 3: ");
        fulano.nota3 = leitor.nextInt();

        System.out.print("Nota 4: ");
        fulano.nota4 = leitor.nextInt();

        System.out.println("\nDados do aluno: ");
        System.out.println("------------");
        System.out.println("Nome.....: " + fulano.nome);
        System.out.println("Matrícula: " + fulano.matricula);
        System.out.println("Idade....: " + fulano.idade + " anos");
        System.out.println("Nota 1...: " + fulano.nota1);
        System.out.println("Nota 2...: " + fulano.nota2);
        System.out.println("Nota 3...: " + fulano.nota3);
        System.out.println("Nota 4...: " + fulano.nota4);
    }
}
