// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int size;
    char symbol;
    string startLine, line1, line2;
    bool white;

    cin >> size;

    while(size != 0)
    {
        cin >> symbol;

        startLine = "|";
        for(int i = 0; i < 8 * size; i++)
        {
            startLine += "-";
        }
        startLine += "|";

        white = true;
        line1 = "|";
        line2 = "|";
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(white)
                {
                    line1 += " ";
                    line2 += symbol;
                }
                else
                {
                    line1 += symbol;
                    line2 += " ";
                }
                
            }
            white = !white;
        }
        line1 += "|";
        line2 += "|";

        cout << startLine << endl;

        white = true;
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(white)
                {
                    cout << line1 << endl;
                }
                else
                {
                    cout << line2 << endl;
                }
                
            }
            white = !white;
        }

        cout << startLine << endl;

        cin >> size;
    }
    return 0;
}