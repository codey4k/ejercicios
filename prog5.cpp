#include <iostream>
//#include <exception>

using namespace std;

int main() {
    int n = 10;

    try {
        throw n;
    }
    catch(int e) {
        cout << "Excepcion capturada...\n";
    }

    return 0;
}
