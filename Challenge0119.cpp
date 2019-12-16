// Adrián Navarro Gabino

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int soldiers, side, shields;
    
    do
    {
        cin >> soldiers;
        
        if(soldiers != 0)
        {
            shields = 0;
            while(soldiers > 0)
            {
                side = (int)sqrt(soldiers);
                soldiers -= (side * side);
                shields += (side * side + 4 * side);
            }
            
            cout << shields << endl;
            soldiers = 1;
        }
    } while(soldiers != 0);
    
    return 0;
}
