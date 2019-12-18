// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int p, n;
    
    while(cin >> p >> n && (p >= 0 || n >= 0))
    {
        if(n >= p || (n == 0 && p == 1))
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    
    return 0;
}
