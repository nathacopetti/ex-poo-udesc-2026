package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.print("Titulo do Livro: ");
        livro.setTitulo(leitor.nextLine());

        System.out.print("Autor do Livro: ");
        livro.setAutor(leitor.nextLine());

        System.out.print("Gênero do Livro: ");
        livro.setGenero(leitor.nextLine());;

        System.out.print("Emprestado? Insira 'true' ou 'false': ");
        livro.setEmprestado(leitor.nextBoolean());

        System.out.printf("Título do Livro: %s - Autor do Livro: %s - Gênero do Livro: %s - Emprestado? %b",
                livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getEmprestado());
    }
}