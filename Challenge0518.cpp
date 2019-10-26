// Adrián Navarro Gabino

#include <iostream>

using namespace std;

bool existe(int dia, int mes)
{
    if(dia > 31 || dia < 1)
        return false;
    if(mes < 1 || mes > 12)
        return false;
    switch(mes)
    {
        case 4:
        case 6:
        case 9:
        case 11:
            if(dia > 30)
                return false;
            break;
        case 2:
            if(dia > 28)
                return false;
            break;
    }
    
    return true;
}

int main()
{
    string pi;
    string aux;
    int entera;
    int decimalPart;
    string delimiter = ".";
    
    do
    {
        cin >> pi;
        
        if(pi.compare("0.00") != 0)
        {
            entera = stoi(pi.substr(0, pi.find(delimiter)));
            
            decimalPart = stoi(pi.substr(pi.find(delimiter) + 1));
            
            if(existe(decimalPart, entera))
            {
                cout << "SI" << endl;
            }
            else
            {
                cout << "NO" << endl;
            }
        }
    } while(pi.compare("0.00") != 0);
    
    return 0;
}
