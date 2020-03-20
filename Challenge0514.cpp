// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int numOfMonths;

    while(cin >> numOfMonths && numOfMonths != 0)
    {
        int months[numOfMonths];
        int result[numOfMonths];

        cin >> months[0];
        result[0] = 0;

        for(int i = 1; i < numOfMonths; i++)
        {
            result[i] = 0;
            cin >> months[i];

            for(int j = i - 1; j >= 0; j--)
            {
                if(months[j] <= months[i])
                {
                    break;
                }
                else
                {
                    result[i] += result[j] + 1;
                    j -= result[j];
                }
            }
        }

        cout << 0;

        for(int i = 1; i < numOfMonths; i++)
        {
            cout << " " << result[i];
        }

        cout << endl;
    }

    return 0;
}