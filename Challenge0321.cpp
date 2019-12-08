// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, up, down, total, range;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> up >> down;
        total = up + down;
        range = total * (total + 1) / 2 + 1 + up;
        cout << range << endl;
    }
    
    return 0;
}
