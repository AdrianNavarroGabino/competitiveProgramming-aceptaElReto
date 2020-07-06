// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int numOfDays, range, maxRange, currentRange, currentIndex;

    while(cin >> numOfDays >> range && numOfDays != 0)
    {
        int days[numOfDays];

        maxRange = 1;
        currentRange = 0;
        currentIndex = 0;

        for(int i = 0; i < numOfDays; i++)
        {
            cin >> days[i];
        }

        for(int i = 0; i < numOfDays; i++)
        {
            for(int j = i; j < numOfDays; j++)
            {
                if(abs(days[currentIndex] - days[j]) < range)
                {
                    currentRange++;
                    maxRange = max(maxRange, currentRange);
                    i=j;
                }
                else
                {
                    currentRange--;
                    currentIndex++;
                    i = j-1;
                    break;
                }
            }
        }
       
        cout << maxRange << endl;
    }
    return 0;
}