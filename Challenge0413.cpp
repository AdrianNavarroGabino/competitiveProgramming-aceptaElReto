// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    int width;
    int height;
    int light;
    int dark;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> width >> height;

        light = (width * height + 1) / 2;
        dark = width * height / 2;

        cout << light << " " << dark << endl;
    }

    return 0;
}
