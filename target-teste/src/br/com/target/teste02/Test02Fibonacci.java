package br.com.target.teste02;

/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
 sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21,
 34...), escreva um programa na linguagem que desejar onde, informado um número, 
 ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número 
 informado pertence ou não a sequência.

IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode
 ser previamente definido no código;

*/


public class Test02Fibonacci {
	public static void main(String[] args) {
		int n = 20;
		System.out.println("Sequência de Fibonacci até " + n + ":");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}


