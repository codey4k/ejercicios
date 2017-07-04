#include <stdio.h>

#define MAX 8

int main() {
    char nombre[5];
    
    fgets(nombre, MAX ,stdin);

    printf("Mi nombre es %s \n", nombre);
    return 0;
}
