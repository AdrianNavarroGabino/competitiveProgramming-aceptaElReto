// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int numberOfPeople;
    long long int current, nextPerson;
    bool daltonUp, daltonDown;
    string aux;

    while(cin >> numberOfPeople && numberOfPeople != 0)
    {
        cin >> current;
        daltonUp = true;
        daltonDown = true;

        for(int i = 1; i < numberOfPeople; i++)
        {
            cin >> nextPerson;

            if(nextPerson >= current)
            {
                daltonDown = false;
            }
            
            if(nextPerson <= current)
            {
                daltonUp = false;
            }
            current = nextPerson;
        }

        if(daltonUp || daltonDown)
        {
            cout << "DALTON" << endl;
        }
        else
        {
            cout << "DESCONOCIDOS" << endl;
        }
    }

    return 0;
}
