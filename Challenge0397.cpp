// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    long long int num;

    cin >> cases;

    while(cases--) {
        cin >> num;

        if((num * (num + 1) / 2) % 3 == 0)
            cout << "SI" << endl;
        else
            cout << "NO" << endl;
    }

    return 0;
}