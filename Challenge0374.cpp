// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, timesMin, timesMax;
    long long int num, max, min;

    cin >> cases;

    while(cases--)
    {
        cin >> num;
        max = num;
        min = num;
        timesMin = 1;
        timesMax = 1;
        cin >> num;

        while(num != 0)
        {
            if(num > max)
            {
                max = num;
                timesMax = 1;
            }
            else if(num == max)
            {
                timesMax++;
            }

            if(num < min)
            {
                min = num;
                timesMin = 1;
            }
            else if(num == min)
            {
                timesMin++;
            }

            cin >> num;
        }

        cout << min << " " << timesMin << " " << max << " " << timesMax << endl;
    }

    return 0;
}