package aula4;

public class ClienteMain {

		public static void main(String[] args) {
		        // 1. Instanciar o objeto (criar o cliente na memória)
		        Cliente c1 = new Cliente();
		        
		        // 2. Dar valores aos atributos
		        c1.nome = "João Silva";
		        c1.idade = 70;
		        c1.nacionalidade = "brasileiro";
		        
		        // 3. Testar os métodos e imprimir o resultado
		        System.out.println("Nome: " + c1.nome);
		        System.out.println("É maior de idade? " + c1.eMaiorIdade());
		        System.out.println("Situação: " + c1.eIdosa());
		        System.out.println("É brasileiro? " + c1.eBrasileiro());
		    }
		}

