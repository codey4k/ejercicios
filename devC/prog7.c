#include <stdio.h>

void calculo();

/*int ingresaValor();*/

int main() {
    calculo();
    return 0;
}

void calculo() {
    // printf("Ingresa valore 10 digitos");
    
    int *pares, *impares, numero;
    int control = 1;

    while(control <= 10) {
        printf("ingresa numero: ");
        scanf("%d", &numero);

        if(numero % 2 == 0) {
            pares[control - 1] = numero;
        }
        else {
            impares[control - 1] = numero;
        }
        control += 1;
    }
}
