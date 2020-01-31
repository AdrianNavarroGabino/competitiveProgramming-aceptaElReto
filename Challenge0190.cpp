// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int num1, num2;
    unsigned long long int result;
    
    while(cin >> num1 >> num2 && num1 >= num2)
    {
        result = 1;
        
        for(int i = num2 + 1; i <= num1; i++)
        {
            result *= i;
        }
        
        cout << result << endl;
    }
    
    return 0;
}
