// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int cases, numOfTemp, peaks, valleys;
    
    cin >> cases;
    
    while(cases--)
    {
        cin >> numOfTemp;
        
        int data[numOfTemp];
        
        for(int i = 0; i < numOfTemp; i++)
        {
            cin >> data[i];
        }
        
        peaks = 0;
        valleys = 0;
        
        for(int i = 1; i < numOfTemp - 1; i++)
        {
            if(data[i - 1] < data[i] && data[i + 1] < data[i])
            {
                peaks++;
            }
            else if(data[i - 1] > data[i] && data[i + 1] > data[i])
            {
                valleys++;
            }
        }
        
        cout << peaks << " " << valleys << endl;
    }
    
    return 0;
}
