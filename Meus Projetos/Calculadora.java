package aula4;

public class Calculadora {

	public String operacao;
	public String[] operacoes = new String[1000];
	public int ind;
	
	public float somar(float v1,float v2) {
		operacoes[ind] = "somar";
		ind++;
		operacao = "somar";
		return v1 + v2;
	}
	
	public float subtrair(float v1,float v2) {
		operacoes[ind] = "subtrair";
		ind++;
		operacao = "subtrair";
		return v1 - v2;
	}
	
	public float dividir(float v1,float v2) {
		operacoes[ind] = "dividir";
		ind++;
		operacao = "dividir";
		return v1 / v2;
	}
	
	public float multiplicar(float v1,float v2) {
		operacoes[ind] = "multiplicar";
		ind++;
		operacao = "multiplicar";
		return v1 * v2;
	}
}
