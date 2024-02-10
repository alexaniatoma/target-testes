package br.com.target.teste05;
/*
 * 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência 
ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;
 */

public class Teste05 {
	public static void main(String[] args) {
		String original = "Target!";
		String reversed = reverseString(original);
		System.out.println("Original: " + original);
		System.out.println("Reverso: " + reversed);
	}

	public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed.append(str.charAt(i));
	        }
	        return reversed.toString();
	}
}
