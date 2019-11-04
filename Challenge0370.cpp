// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int size1;
    int size2;
    int cases;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> size1 >> size2;
        size2 *= -1;
        
        if((size1 % 2 == 0 && size2 == size1 + 1) ||
            (size2 % 2 == 0 && size1 == size2 + 1))
        {
            cout << "SI" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
    
    return 0;
}
