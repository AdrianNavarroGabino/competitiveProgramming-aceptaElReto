// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    int numbers;
    int count;
    int number;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        count = 0;
        
        cin >> numbers;
        
        for(int j = 0; j < numbers; j++)
        {
            cin >> number;
            count = number % 2 == 0 ? count + 1 : count;
        }
        
        cout << count << endl;
    }
    return 0;
}
