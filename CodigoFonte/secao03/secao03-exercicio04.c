#include <stdio.h>

int main(){
	//Declarando variáveis
	int num1, num2, soma;

	//Entradas
	printf("Informe o primeiro número: ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Informe o segundo número: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	soma = (num1 + num2);

	//Saída
	printf("A soma é %d", soma);
}
