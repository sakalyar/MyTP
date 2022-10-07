#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>

char c;

int main(int argc, char* argv[]) {
	for (int i = 0; i < argc; ++i) {
		int len = strlen(argv[i]);
		while(scanf("%c", &c) != '\0') {
			printf("%c", c);
		}
		printf("\n");
	}
	
	
}
