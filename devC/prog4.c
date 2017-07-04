#include <stdio.h>

#define MAX 20

struct Libreria {
    char Titulo[MAX];
    char Autor[MAX];  
};

int main() {
    
    struct Libreria Libro;

    printf("Titulo del libro: ");
    fgets(Libro.Titulo, MAX, stdin);
   
    printf("Autor del libro: ");
    fgets(Libro.Autor, MAX, stdin);
    
    
    printf("Tu libro es %s escrito por %s \n", Libro.Titulo, Libro.Autor);

    return 0;
}
