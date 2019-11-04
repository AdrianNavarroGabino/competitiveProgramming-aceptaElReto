// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int payments;
    int money;
    int result;
    
    do
    {
        result = 0;
        
        cin >> payments;
        
        if(payments != 0)
        {
            for(int i = 0; i < payments; i++)
            {
                cin >> money;
                result += money;
            }
            
            cout << result << endl;
        }
    }while(payments != 0);
    
    return 0;
}
