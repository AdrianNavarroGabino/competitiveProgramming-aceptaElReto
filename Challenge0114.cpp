// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    int number;
    int factorial;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> number;
        
        if(number <= 1)
        {
            factorial = 1;
        }
        else if(number == 2)
        {
            factorial = 2;
        }
        else if(number == 3)
        {
            factorial = 6;
        }
        else if(number == 4)
        {
            factorial = 4;
        }
        else
        {
            factorial = 0;
        }
        
        cout << factorial << endl;
    }
    return 0;
}
