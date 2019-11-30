// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int ch1;
    int ch2;
    int result;
    
    do
    {
        cin >> ch1 >> ch2;
        
        if(ch1 != 0 && ch2 != 0)
        {
            if(ch1 > ch2)
            {
                ch1 += ch2;
                ch2 = ch1 - ch2;
                ch1 -= ch2;
            }
            
            result = abs(ch2 - ch1) < abs(ch1 + 99 - ch2) ?
                abs(ch2 - ch1) : abs(ch1 + 99 - ch2);
            
            cout << result << endl;
        }
    } while(ch1 != 0 && ch2 != 0);
    
    return 0;
}
