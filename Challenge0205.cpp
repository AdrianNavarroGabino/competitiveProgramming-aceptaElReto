// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    string number;
    int cases, iterations, num1, num2;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> number;
        iterations = 0;
        
        do
        {
            num1 = stoi(number);
            int len = number.length();
            int n = len - 1;
            for(int i = 0; i < (len / 2); i++)
            {
                swap(number[i], number[n]);
                n = n - 1;
            }
            num2 = stoi(number);
            number = to_string(num1 + num2);
            iterations++;
        } while((num1 != num2 || iterations == 1) && number.length() < 10);
        
        if(num1 == num2)
        {
            cout << iterations - 1 << " " << num1 << endl;
        }
        else
        {
            cout << "Lychrel?" << endl;
        }
    }
    
    return 0;
}
