// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int number;
    int numberOfSymbols;
    char symbol;
    int j;
    int k;
    
    do
    {
        cin >> number >> symbol;
        
        numberOfSymbols = number;
        
        for(int row = 1; row <= number; row++)
        {
            j = number - row;
            for(int espacio = 0; espacio < j; espacio++)
            {
                cout << " ";
            }
            for(int j = 0; j < numberOfSymbols; j++)
            {
                cout << symbol;
            }
            cout << endl;
            numberOfSymbols += 2;
        }
        
        numberOfSymbols -= 4;
        j = number - 1;
        
        for(int row = 1; row <= j; row++)
        {
            k = row + 1;
            for(int espacio = 1; espacio < k; espacio++)
            {
                cout << " ";
            }
            for(int j = 0; j < numberOfSymbols; j++)
            {
                cout << symbol;
            }
            cout << endl;
            numberOfSymbols -= 2;
        }
    } while(number != 0 || symbol != '0');

	return 0;
}
