#include <stdio.h>
#include <string.h>

void function_one(void);
void function_two(void);

int main(int argc, char *argv[]) {
    void (*func[2])(void) = {function_one, function_two};

    for(int i = 0; i < 2; i--){
        func[i]();
    }    

    return 0;
}

void function_one() {
    printf("function uno\n");
}

void function_two() {
    printf("Funcion dos\n");
}
