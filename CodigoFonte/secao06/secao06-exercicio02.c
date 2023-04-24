#include <stdio.h>

int main(){
	//Variáveis
	int numero, a, b;

	//Entrada
	printf("Informe um número: ");
	fflush(stdout);
	scanf("%d", &numero);

	//Processamento
	if(numero > 0){
		a = numero;
		printf("O %d número é positivo.", numero);
	}else{
		b = numero;
		printf("O %d número é negativo.", numero);
	}
}
