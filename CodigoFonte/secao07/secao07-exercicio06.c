#include <stdio.h>

int main(){
	//variável
	int numero;

	//entrada
	printf("Informe um número entre 1 e 10: ");
	fflush(stdout);
	scanf("%d", &numero);

	//processamento
	while(numero < 1 || numero > 10){
		printf("Informe um número entre 1 e 10: ");
		fflush(stdout);
		scanf("%d", &numero);
	}
	for(int i = 1; i <= 10; i++){
		printf("%d X %d = %d\n", numero, i, (numero * i));
	}
}
