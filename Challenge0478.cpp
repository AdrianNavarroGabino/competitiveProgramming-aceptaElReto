// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, i, j;
    long long int realDamage, expectedDamage, difference;

    while(cin >> cases && cases != 0)
    {
        int damage[cases];
        expectedDamage = 0;

        for(int i = 0; i < cases; i++)
        {
            cin >> damage[i];

            expectedDamage += damage[i];
        }

        cin >> realDamage;

        difference = expectedDamage - realDamage;

        i = 0;
        j = cases - 1;

        while(true)
        {
            if(damage[i] + damage[j] == difference)
            {
                cout << damage[i] << " " << damage[j] << endl;
                break;
            }
            else if(damage[i] + damage[j] > difference)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
    }

    return 0;
}