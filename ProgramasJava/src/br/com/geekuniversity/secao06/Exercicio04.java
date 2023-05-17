package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variáveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o sexao m/f: ");
		sexo  = teclado.next().charAt(0);
		
		//processamento
		if(sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58;//cast
			System.out.printf("Seu pedo ideal é %.2f", peso_ideal);
		}
		if(sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("Seu peso ideal é %.2f", peso_ideal);
		}
		if(sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
			peso_ideal = 0;
		}
		teclado.close();
	}
	

}
