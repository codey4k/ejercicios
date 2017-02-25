#include <stdio.h>

/*prototipo de funcion*/
int suma(int n);

/*funcion principal*/
int main(){
    int sum = suma(4);
    printf("El resultado es: %d \n", sum);
    return 0;
}

/*definicion de funcion*/
int suma(int n){
    return n + 2;
}
