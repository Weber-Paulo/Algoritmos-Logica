package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		float valor_por_hora, salario;
		int horas_trabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Qual valor você ganha por hora? ");
		valor_por_hora = teclado.nextFloat();
		
		System.out.println("Quantas horas você trabalhou neste mês? ");
		horas_trabalhadas = teclado.nextInt();
		
		//processamento
		salario = (horas_trabalhadas * valor_por_hora);
		
		//saída
		System.out.println("Neste mês você vai receber R$ " + salario);
		
		teclado.close();

	}

}
