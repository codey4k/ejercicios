#include <iostream>

using namespace std;

class Persona {
    private:
        int number;
    public:
        //constructor
        Persona(int n);
        //metodo de la clase
        void imprime(void);
};

Persona::Persona(int n){
    number = n;
}

void Persona::imprime(void){
    cout << "Hola, tu numero es " << number << endl;
}

int main() {
    int num;
    cout << "Ingresa un numero ";
    cin >> num;

    Persona alguien(num);
    alguien.imprime();
 
    return 0;
}
