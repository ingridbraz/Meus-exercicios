package aula4;

public class NotaFiscal {

	public String[] nomesItens = new String[5];
	public Float[] precosItens = new Float[5];
	public int contador = 0;
	public final int MAX_ITENS = 5;

	public boolean cadastrar(String nome, Float preco) {
		if (contador >= MAX_ITENS) {
			System.out.println("Limite de itens atingido :(");
			return false;
		}

		nomesItens[contador] = nome;
		precosItens[contador] = preco;
		contador++;
		System.out.println("Item cadastrado com sucesso!");
		return true;
	}

	public void relatorio() {
		
		String dados = "=== RELATÓRIO DE ITENS ===\n";
		
		
		for (int cont = 0; cont < contador; cont++) {
		
			dados += "\nProduto " + (cont + 1) + ": " + nomesItens[cont];
			dados += "\nPreço: R$ " + precosItens[cont];
			dados += "\n-----------------------";
		}
		
		if (contador == 0) {
			dados += "\nNenhum item cadastrado no momento.";
		}

		System.out.println(dados);
	}
}