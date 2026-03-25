package aula4;

import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("=== CADASTRO DE PRODUTO ===");
		
		System.out.print("Digite o código: ");
		p.codigo = teclado.nextInt();
		
	
		teclado.nextLine(); 
		
		System.out.print("Digite o nome do produto: ");
		p.nome = teclado.nextLine();
		
		System.out.print("Digite o preço (R$): ");
		p.preco = teclado.nextFloat();
		
		System.out.print("Digite o peso (kg): ");
		p.peso = teclado.nextFloat();
		
		System.out.println("\n--- RESULTADO ---");
		
		
		p.mostrarDescricao();
		p.verificarSeProdutoCaro();
		
		teclado.close();
	}
}