// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    short dim, numOfQueens;
    bool possible;

    while(cin >> dim >> numOfQueens && dim != 0)
    {
        possible = true;
        int queens[numOfQueens][2];

        for(short i = 0; i < numOfQueens; i++)
        {
            cin >> queens[i][0] >> queens[i][1];
        }

        for(short i = 0; i < numOfQueens - 1; i++)
        {
            for(short j = (short)(i + 1); j < numOfQueens; j++)
            {
                if(queens[i][0] == queens[j][0] ||
                    queens[i][1] == queens[j][1] ||
                    abs(queens[i][0] - queens[j][0]) ==
                        abs(queens[i][1] - queens[j][1]))
                {
                    possible = false;
                    break;
                }
            }

            if(!possible)
            {
                break;
            }
        }

        if(possible)
        {
            cout << "NO" << endl;
        }
        else
        {
            cout << "SI" << endl;
        }
        
    }

    return 0;
}