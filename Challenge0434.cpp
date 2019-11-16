// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int pigeons;
    int holes;
    
    int cases;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> pigeons >> holes;
        
        if(pigeons > holes)
        {
            cout << "PRINCIPIO" << endl;
        }
        else
        {
            cout << "ROMANCE" << endl;
        }
    }
    
    return 0;
}
