// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, floor, steps, floorsUp, stepsUp, resultUp, resultDown;
    
    cin >> cases;
    
    while(cases--)
    {
        cin >> floor >> steps >> floorsUp >> stepsUp;
        
        resultDown = steps * floorsUp + stepsUp;
        resultUp = resultDown + floor * steps;
        
        cout << resultDown << " " << resultUp << endl;
    }
    
    return 0;
}
