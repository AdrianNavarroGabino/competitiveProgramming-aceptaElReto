// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, leafs;
    cin >> cases;

    while(cases--)
    {
        cin >> leafs;
        
        if(leafs < 3 || leafs == 5)
        {
            cout << "IMPOSIBLE" << endl;
        }
        else if(leafs % 3 == 0)
        {
            cout << "0" << endl;
        }
        else if(leafs % 3 == 1)
        {
            cout << "1" << endl;
        }
        else
        {
            cout << "2" << endl;
        }
    }

    return 0;
}