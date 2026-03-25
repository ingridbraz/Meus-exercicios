package aula4;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.print("Digite o primeiro número: ");
		float n1 = teclado.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = teclado.nextFloat();
		
		System.out.println("Escolha: 1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão");
		int operacao = teclado.nextInt();
		
		float res = 0;
		
	
		if (operacao == 1) res = calc.somar(n1, n2);
		else if (operacao == 2) res = calc.subtrair(n1, n2);
		else if (operacao == 3) res = calc.multiplicar(n1, n2);
		else if (operacao == 4) res = calc.dividir(n1, n2);
		
		System.out.println("Resultado: " + res);
		
		
		System.out.println("Histórico: " + calc.operacoes[calc.ind - 1]);
		
		teclado.close();
	}
}