// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, p, d, s, m, d1, s1, m1;
    cin >> cases;
    
    while(cases--)
    {
        cin >> p >> d >> s >> m;
        
        d1 = 0;
        s1 = 0;
        m1 = 0;
        
        if(p % m != 0)
        {
            m1 = p / m;
            p %= m;
        }
        else
        {
            m1 = p / m - 1;
            p = p > 0 ? m : 0;
        }
        
        if(p % s != 0)
        {
            s1 = p / s;
            p %= s;
        }
        else
        {
            s1 = p / s - 1;
            p = p > 0 ? s : 0;
        }
        
        if(p % d != 0)
        {
            d1 = p / d + 1;
        }
        else
        {
            d1 = p / d;
        }
        
        cout << m1 << " " << s1 << " " << d1 << endl;
    }
    
    return 0;
}
