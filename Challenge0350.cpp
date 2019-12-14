// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int a, b;
    
    do
    {
        cin >> a >> b;
        
        if(a != 0)
        {
            printf("%.1f\n", a * b / 2.0);
        }
    } while(a != 0);
    
    return 0;
}
