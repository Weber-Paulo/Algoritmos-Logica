#include <stdio.h>

int main(){
	//variavel
	int vetor[10];

	//entradas
	for(int i = 0; i < 10; i++){
		printf("Informe o valor para o vetor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}
	for(int i = 9; i >= 0; i--){
		printf("%d\n", vetor[i]);
	}
}
