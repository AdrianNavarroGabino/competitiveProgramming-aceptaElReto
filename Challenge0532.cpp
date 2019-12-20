// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, p1, p2;

    cin >> cases;

    for(int i = 0; i < cases; i++)
    {
        cin >> p1 >> p2;
        cout << p2 - p1 << endl;
    }

    return 0;
}
