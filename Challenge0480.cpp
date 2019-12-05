// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, n, a, b;
    int result;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> n >> a >> b;
        
        result = n / b * a;
        result += (n % b) > a ? a : (n % b);
        cout << result << endl;
    }
    
    return 0;
}
