// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int side1;
    int side2;
    
    do
    {
        cin >> side1 >> side2;
        
        if(side1 >= 0 && side2 >= 0)
        {
            cout << side1 * 2 + side2 * 2 << endl;
        }
    } while(side1 >= 0 && side2 >= 0);
}
