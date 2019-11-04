// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int eggs;
    int maxEggs;
    int result;
    
    do
    {
        cin >> eggs >> maxEggs;
        
        if(eggs != 0 || maxEggs != 0)
        {
            result = eggs / maxEggs * 10;
            
            if(eggs % maxEggs != 0)
            {
                result += 10;
            }
            
            cout << result << endl;
        }
    } while(eggs != 0 || maxEggs != 0);
    
    return 0;
}
