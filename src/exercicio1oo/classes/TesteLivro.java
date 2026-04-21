package exercicio1oo.classes;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.print("Titulo do Livro: ");
        livro.titulo = leitor.nextLine();

        System.out.print("Autor do Livro: ");
        livro.autor = leitor.nextLine();

        System.out.print("Gênero do Livro: ");
        livro.genero = leitor.nextLine();

        System.out.print("Emprestado? Insira 'true' ou 'false': ");
        livro.emprestado = leitor.nextBoolean();

        System.out.println("\nDados do Livro: ");
        System.out.println("------------");
        System.out.println("Titulo do Livro.: " + livro.titulo);
        System.out.println("Autor do Livro..: " + livro.autor);
        System.out.println("Gênero do Livro.: " + livro.genero);
        System.out.println("Livro Emprestado: " + livro.emprestado);
    }
}