// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int user, hour1, hour2, min1, min2, totalH, totalM;
    string aux;
    
    do
    {
        cin >> user;
        
        if(user != 0)
        {
            totalH = 0;
            totalM = 0;
            
            for(int i = 0; i < user; i++)
            {
                cin >> aux;
                hour1 = stoi(aux.substr(0, 2));
                min1 = stoi(aux.substr(3, 2));
                hour2 = stoi(aux.substr(6, 2));
                min2 = stoi(aux.substr(9, 2));
                
                if(hour1 >= 22)
                {
                    hour1 -= 24;
                }
                if(hour2 >= 22)
                {
                    hour2 -= 24;
                }
                
                if(min1 > min2)
                {
                    totalM += (60 + min2 - min1);
                    totalH--;
                }
                else
                {
                    totalM += (min2 - min1);
                }
                    
                totalH += (hour2 - hour1);
                
                if(totalM > 59)
                {
                    totalH += (totalM / 60);
                    totalM %= 60;
                }
            }
            
            printf("%02d:%02d\n", totalH, totalM);
        }
    } while(user != 0);
    
    return 0;
}
