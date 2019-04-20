#include <stdio.h>
#include <string.h>


unsigned char cadena[] = "Hola mundo";

void func(void);

int main(int argc, char *argv) {
    
    void (*ejem)(void) = {func};
    (*ejem)();
    
    return 0;
}

void func(void) {
    printf("%s\n", cadena);
}