// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    long long int result, p, s, t;

    while(cin >> p >> s >> t && p != 0)
    {
        result = 0;
        for(int i = 0; i < t; i++)
        {
            result += p;
            p *= s;
        }
        cout << result << endl;
    }

    return 0;
}