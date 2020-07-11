// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    long long int result, faces, aux;

    cin >> cases;

    while(cases--)
    {
        cin >> faces;

        aux = faces - 2;

        result = faces * faces * faces - aux * aux * aux;

        cout << result << endl;
    }

    return 0;
}