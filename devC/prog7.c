#include <stdio.h>

#define MAX 10

void calculo();

/*int ingresaValor();*/

int main() {
    calculo();
    return 0;
}

void calculo() {
    // printf("Ingresa valore 10 digitos");
    
    int pares = 0, impares = 0, numero;
    int control = 1;

    while(control <= 10) {
        printf("ingresa numero: ");
        scanf("%d", &numero);

        if(numero % 2 == 0) {
            pares += 1;
        }
        else {
            impares += 1;
        }
        control += 1;
    }
    
    printf("Ingresaste: %d numeros pares y %d numeros impares\n",pares, impares);
}