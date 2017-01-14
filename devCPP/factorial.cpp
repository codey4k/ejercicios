/*
*Factorial de un número
*/

#include <iostream>

using namespace std;

int factorial(int);

int main(){
    int n;
    cout << "Ingresa un número: ";
    cin >> n;
    cout << "El factorial del número es: " << factorial(n) << endl;
    return 0;
}

int factorial(int n){
    if (n <= 1) {
        return 1;
    }
    
    else {
        if(n <= 1) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
