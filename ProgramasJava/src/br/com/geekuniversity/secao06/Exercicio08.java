package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		//variáveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O número %d é par e positivo. \n", numero);
			}else {
				System.out.printf("O número %d é par e negativo. \n", numero);
			}
		}else {
			if(numero > 0) {
				System.out.printf("O número %d é impar e positivo. \n", numero);
			}else {
				System.out.printf("O número %d é impar e negativo. \n", numero);
		}

	}
		teclado.close();

}

}