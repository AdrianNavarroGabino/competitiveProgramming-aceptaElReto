// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int piezas;
    int sumaPiezasUsuario;
    int sumaTotalPiezas;
    int numeroPiezas;
    cin >> numeroPiezas;
    while(numeroPiezas != 0)
    {
        sumaPiezasUsuario = 0;
        sumaTotalPiezas = numeroPiezas * (numeroPiezas + 1) / 2;
        
        for(int i = 0; i < numeroPiezas - 1; i++)
        {
            cin >> piezas;
            sumaPiezasUsuario += piezas;
        }
        
        cout << (sumaTotalPiezas - sumaPiezasUsuario) << endl;
        
        cin >> numeroPiezas;
    }
    return 0;
}
