// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int aux[13] = {365, 334, 306, 275,
            245, 214, 184, 153, 122, 92, 61,
            31, 0};
    int cases, day, month, days;
    cin >> cases;
    
    for(int i = 0; i < cases; i++)
    {
        cin >> day >> month;
        
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
        }
        
        days = days - day + aux[month];
        
        cout << days << endl;
    }
    
    return 0;
}
