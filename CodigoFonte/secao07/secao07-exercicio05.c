#include <stdio.h>
#include <string.h>

int main(){
	//variáveis
	char nome[100], senha[100];

	//entradas
	printf("Informe o nome: ");
	fflush(stdout);
	gets(nome);
	printf("Informe a senha: ");
	fflush(stdout);
	gets(senha);

	//processamentos
	while(!strcmp(nome, senha)){
		printf("Nome de usuário e senha devem ser diferentes.\n");
		printf("Informe o nome: ");
		fflush(stdout);
		gets(nome);
		printf("Informe a senha: ");
		fflush(stdout);
		gets(senha);
	}
}
