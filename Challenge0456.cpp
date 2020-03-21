// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, w, h, currentTablet, totalChocolate, result;
    cin >> cases;

    while(cases--)
    {
        cin >> w >> h >> totalChocolate;
        currentTablet = w * h;

        result = totalChocolate / currentTablet;
        result += totalChocolate % currentTablet == 0 ? 0 : 1;

        cout << result << endl;
    }

    return 0;
}