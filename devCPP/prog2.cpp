#include <iostream>

using namespace std;

int recursive(int n);

int main(void){
    int num;
    cout << "Ingresa valor: ";
    cin >> num;
    cout << "Tu valor aumento  a: "<< recursive(num) << endl;

    return 0;
}

int recursive(int n) {
    if(n < 10) {
        return recursive(n+1);
    }   
    else {
        return n;
    }
}
