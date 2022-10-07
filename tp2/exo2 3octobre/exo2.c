#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
	int x;
	scanf("%d", &x);
	
	printf("%d\n", x);
	for (int i = 1; i <= x; ++i) {
		
		switch(fork()) {
			case -1:
				perror("fork");
				exit(EXIT_FAILURE);
			case 0:
				printf("Je suis un fils et j'affiche le numéro: %d\n", i);
				exit(EXIT_SUCCESS);
			default:
				wait(NULL);
				printf("Les %d processus sont terminés\n", x);
		}
	}
}
