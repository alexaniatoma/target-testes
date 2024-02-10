package br.com.target.teste04;

/*
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de 
representação que cada estado teve dentro do valor total mensal da distribuidora.
 */

public class Teste04 {

	public static void main(String[] args) {
		double sp = 67836.43;
		double rj  = 36678.66;
		double mg  = 29229.88;
		double es  = 27165.48;
		double outros  = 19849.53;
		double total = soma(sp, rj, mg, es, outros);
		
		System.out.println("Total Geral Estados: " + total);
		System.out.printf("Percentual SP:  %.2f\n " , percentual(sp, total));
		System.out.printf("Percentual RJ:  %.2f\n " , percentual(rj, total));
		System.out.printf("Percentual MG:  %.2f\n " , percentual(mg, total));
		System.out.printf("Percentual ES:  %.2f\n " , percentual(es, total));
		System.out.printf("Percentual OUTROS:  %.2f\n " , percentual(outros, total));
		
	}
	
	public static double soma(double sp, double rj, double mg, double es, double outros) {
		return sp + rj + mg + es + outros;
	}
	
	public static double percentual(double estado, double total) {
		double percentual = (estado / total) * 100;
		return percentual;
		
	}

}
