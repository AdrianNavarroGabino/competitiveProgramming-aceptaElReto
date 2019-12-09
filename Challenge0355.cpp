// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, year;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> year;
        
        if(year % 4 != 0)
        {
            cout << 28 << endl;
        }
        else if(year % 400 == 0)
        {
            cout << 29 << endl;
        }
        else if(year % 100 == 0)
        {
            cout << 28 << endl;
        }
        else
        {
            cout << 29 << endl;
        }
    }
    
    return 0;
}
