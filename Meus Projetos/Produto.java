package aula4;

public class Produto {
	
	// definicao dos atributos
	public int codigo;
	public String nome;
	public float preco;
	public float peso;
	
	// definicao dos metodos
	
	public void mostrarDescricao() {
		System.out.println("Cod: " + codigo + " nome: " + nome + " R$ " + preco);
	}
	
	public void verificarSeProdutoCaro() {
		if(preco > 500) {
			System.out.println("Este produto é caro");
		}else {
			System.out.println("Este produto é baratinho");
		}
	}
	
}
