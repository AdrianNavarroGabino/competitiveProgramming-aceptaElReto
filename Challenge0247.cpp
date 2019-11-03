// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    bool result;
    int aux;
    int currentNumber;
    
    do
    {
        cin >> cases;
        
        if(cases != 0)
        {
            result = true;
            currentNumber = -1;
            
            for(int i = 0; i < cases; i++)
            {
                cin >> aux;
                
                if(aux <= currentNumber)
                {
                    result = false;
                }
                currentNumber = aux;
            }
            
            if(result)
            {
                cout << "SI" << endl;
            }
            else
            {
                cout << "NO" << endl;
            }
        }
    } while(cases != 0);
    return 0;
}
