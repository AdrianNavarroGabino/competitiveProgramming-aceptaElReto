// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int sweets, data, people;
    sweets = -1;
    
    while(sweets != 0)
    {
        cin >> data;
        people = 1;
        sweets = data;
        
        if(sweets != 0)
        {
            while(cin >> data && data != 0)
            {
                people++;
                sweets += data;
            }
        
            if(data == 0)
            {
                if(sweets % people == 0)
                {
                    cout << "REPARTO JUSTO" << endl;
                }
                else
                {
                    cout << "IMPOSIBLE" << endl;
                }
            }
        }
    }
    
    return 0;
}
