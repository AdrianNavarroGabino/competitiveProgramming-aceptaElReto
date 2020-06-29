// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, firstNum, lastNum;
    string op;

    cin >> cases;

    while(cases--)
    {
        cin >> firstNum >> op >> lastNum;
        lastNum = op == "+" ? lastNum + firstNum : firstNum - lastNum;
        cout << lastNum;

        while(cin >> op && op != ".")
        {
            cin >> firstNum;
            lastNum = op == "+" ? lastNum + firstNum : lastNum - firstNum;
            cout << ", " << lastNum;
        }

        cout << endl;
    }

    return 0;
}