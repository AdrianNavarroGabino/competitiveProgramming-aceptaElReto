// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, antennas, dist, lDist, pos, coverage;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> dist >> antennas;
        
        coverage = 0;
        
        for(int i = 0; i < antennas; i++)
        {
            cin >> pos >> lDist;
        
            if(pos - lDist <= coverage &&
                    pos + lDist > coverage)
                coverage = pos + lDist;
        }
        
        if(coverage >= dist)
            cout << "SI" << endl;
        else
            cout << "NO" << endl;
    }
    
    return 0;
}
