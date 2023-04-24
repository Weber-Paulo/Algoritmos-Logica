#include <stdio.h>

int main(){
	//variável
	float indice;

	//entrada
	printf("Informe o índice de poluição: ");
	fflush(stdout);
	scanf("%f", &indice);

	//processamento
	if(indice >= 0.3 && indice < 0.4){
		printf("Atenção: Indústrias do 1º grupo devem suspender as atividades.");
	}else if(indice >= 0.4 && indice < 0.5){
		printf("Atenção: Indústrias do 1º e 2º grupos devem suspender as atividades.");
	}else if(indice >= 0.5){
		printf("Atenção: Todos os grupos devem suspender as atividades.");
	}else{
		printf("Níveis aceitáveis");
	}
}
