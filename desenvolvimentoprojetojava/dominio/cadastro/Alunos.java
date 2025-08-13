package desenvolvimentoprojetojava.dominio.cadastro;

import desenvolvimentoprojetojava.dominio.alunos.CadastroAppAlunos;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cadastro de Alunos ===");

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        CadastroAppAlunos cadastroAppAlunos = new CadastroAppAlunos(nome, idade, matricula);

        System.out.println("\ncadastroAppAlunos");
        System.out.println(cadastroAppAlunos);

        scanner.close();
    }
}
