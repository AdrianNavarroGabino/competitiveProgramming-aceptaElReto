// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int distance, maxSpeed, time;

    while(cin >> distance >> maxSpeed >> time && 
        (distance != 0 || maxSpeed != 0 || time !=0))
    {
        if(distance <= 0 || maxSpeed <= 0 || time <= 0)
        {
            cout << "ERROR" << endl;
        }
        else
        {
            if(18 * distance < maxSpeed * time * 5)
            {
                cout << "OK" << endl;
            }
            else if(3 * distance < maxSpeed * time)
            {
                cout << "MULTA" << endl;
            }
            else
            {
                cout << "PUNTOS" << endl;
            }
        }
    }

    return 0;
}