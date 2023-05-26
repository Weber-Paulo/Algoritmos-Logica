package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//variáveis
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o índice de poluição: ");
		indice = teclado.nextFloat();
		
		//processamento
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: Indústrias do 1º grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Aenção: Indústrias do 1º e 2º grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Atencção: Todos os grupos devem suspender as atividades.");
		}
		teclado.close();
			
		}
			

	}


