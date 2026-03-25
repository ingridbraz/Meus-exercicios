package aula4;

import java.util.Scanner;

public class NotaFiscalMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		NotaFiscal nf = new NotaFiscal();
		
		System.out.println("=== SISTEMA DE NOTA FISCAL ===");

		// Loop para cadastrar até 5 itens (o limite da sua classe)
		for (int i = 0; i < nf.MAX_ITENS; i++) {
			System.out.println("\nCadastro do Item " + (nf.contador + 1));
			
			System.out.print("Nome do produto: ");
			String nome = teclado.nextLine();
			
			System.out.print("Preço: ");
			float preco = teclado.nextFloat();
			teclado.nextLine(); // Limpeza de buffer (importante!)

			// Chama o seu método cadastrar
			boolean sucesso = nf.cadastrar(nome, preco);
			
			if (!sucesso) break; // Para se atingir o limite

			System.out.print("Deseja cadastrar outro? (s/n): ");
			String continuar = teclado.nextLine();
			if (continuar.equalsIgnoreCase("n")) {
				break;
			}
		}

		// Mostra o relatório final
		System.out.println("\nGerando relatório...");
		nf.relatorio();
		
		teclado.close();
	}
}