// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    char columns[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    int col, row;
    
    while(cin >> col >> row && col != 0)
    {
        cout << columns[8 - col] << row << endl;
    }
    
    return 0;
}
