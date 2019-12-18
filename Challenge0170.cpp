// Adrián Navarro Gabino

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    int rocks, side, leftover;
    
    while(cin >> rocks && rocks != 0)
    {
        side = (int)((-1 + sqrt(1 + 4 * rocks)) / 2);
        
        while((side + 1) * (side + 2) / 2 <= rocks)
        {
            side++;
        }
        
        leftover = rocks - ((side * (side + 1)) / 2);
        cout << side << " " << leftover << endl;
    }
    
    return 0;
}
