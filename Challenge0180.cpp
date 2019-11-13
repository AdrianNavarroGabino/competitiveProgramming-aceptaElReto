// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases;
    int side1;
    int side2;
    int side3;
    int shortSide1;
    int shortSide2;
    int longSide;
    
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> side1 >> side2 >> side3;
        
        if(side1 > side2)
        {
            shortSide1 = side2;
            
            if(side1 > side3)
            {
                shortSide2 = side3;
                longSide = side1;
            }
            else
            {
                shortSide2 = side1;
                longSide = side3;
            }
        }
        else
        {
            shortSide1 = side1;
            
            if(side2 > side3)
            {
                shortSide2 = side3;
                longSide = side2;
            }
            else
            {
                shortSide2 = side2;
                longSide = side3;
            }
        }
        
        if(longSide >= shortSide1 + shortSide2)
        {
            cout << "IMPOSIBLE" << endl;
        }
        else if(longSide * longSide ==
                shortSide1 * shortSide1 + shortSide2 * shortSide2)
        {
            cout << "RECTANGULO" << endl;
        }
        else if(longSide * longSide <
                shortSide1 * shortSide1 + shortSide2 * shortSide2)
        {
            cout << "ACUTANGULO" << endl;
        }
        else
        {
            cout << "OBTUSANGULO" << endl;
        }
    }
    return 0;
}
