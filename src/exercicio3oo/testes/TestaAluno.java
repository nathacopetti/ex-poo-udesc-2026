package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

import java.util.Scanner;

public class TestaAluno {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno fulano = new Aluno(); //criar objeto

        System.out.print("Nome: ");
        fulano.setNome(leitor.nextLine());

        System.out.print("Matricula: ");
        fulano.setMatricula(leitor.nextLine());

        System.out.print("Idade: ");
        fulano.setIdade(leitor.nextInt());

        System.out.print("Nota 1: ");
        fulano.setNota1(leitor.nextInt());

        System.out.print("Nota 2: ");
        fulano.setNota2(leitor.nextInt());

        System.out.print("Nota 3: ");
        fulano.setNota3(leitor.nextInt());

        System.out.print("Nota 4: ");
        fulano.setNota4(leitor.nextInt());

        double media = (fulano.getNota1() + fulano.getNota2() + fulano.getNota3() + fulano.getNota4()) / 4.0;

        System.out.printf("Nome: %s - Matrícula: %s - Idade: %d - Nota 1: %d - Nota 2: %d - Nota 3: %d - Nota 4: %d - Média: %.2f", fulano.getNome(), fulano.getMatricula(), fulano.getIdade(),
                fulano.getNota1(), fulano.getNota2(), fulano.getNota3(), fulano.getNota4(), media);
    }
}
