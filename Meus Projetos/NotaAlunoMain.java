package aula4;

import java.util.Scanner;

public class NotaAlunoMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NotaAluno aluno = new NotaAluno();
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = teclado.nextLine(); // nextLine para ler nomes completos
		
		System.out.print("Digite a primeira nota: ");
		aluno.nota1 = teclado.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		aluno.nota2 = teclado.nextFloat();
		
		System.out.println("\n--- PROCESSANDO DADOS ---");
		aluno.mostrarDadosAluno();
		
		teclado.close();
	}
}