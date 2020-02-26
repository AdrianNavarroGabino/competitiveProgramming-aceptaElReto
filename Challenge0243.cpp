// Adrián Navarro Gabino

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int dividers, men;

    while(cin >> men && men != 0)
    {
        dividers = 0;

        for(int i = 1; i <= sqrt(men); i++)
        {
            if(men % i == 0)
            {
                if(men / i == i)
                    dividers++;
                else
                    dividers += 2;
            }
        }

        cout << dividers << endl;
    }

    return 0;
}