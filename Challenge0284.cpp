// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, price, payment, difference, c2, c1, c50, c20, c10, c5, c2c, c1c;

    cin >> cases;

    while(cases--)
    {
        cin >> price >> payment;

        if(price > payment)
        {
            difference = price - payment;

            cout << "DEBE " << difference << endl;
        }
        else
        {
            difference = payment - price;

            c2 = difference / 200;
            difference %= 200;
            c1 = difference / 100;
            difference %= 100;
            c50 = difference / 50;
            difference %= 50;
            c20 = difference / 20;
            difference %= 20;
            c10 = difference / 10;
            difference %= 10;
            c5 = difference / 5;
            difference %= 5;
            c2c = difference / 2;
            difference %= 2;
            c1c = difference;

            cout << c2 << " " << c1 << " " << c50 << " " << c20 << " " <<
                c10 << " " << c5 << " " << c2c << " " << c1c << endl;
        }
    }

    return 0;
}