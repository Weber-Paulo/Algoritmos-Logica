#include <stdio.h>

int main(){
	//variáveis
	int n, maior = 0;

	//entrada
	printf("Informe um número: ");
	fflush(stdout);
	scanf("%d", &n);

	//processamento
	while(n != 0){
		if(n > maior){
			maior = n;
		}
		//entrada
		printf("Informe um número: ");
		fflush(stdout);
		scanf("%d", &n);
	}
	printf("O maior número é %d", maior);
}
