// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    int maxHeight, numOfHeightDim, currentHeightDim;
    bool adequate;
    string aux;
    
    while(cin >> maxHeight >> numOfHeightDim)
    {
        adequate = true;
            
        int data[1000000];
        cin >> data[0];
        currentHeightDim = data[0];

        for(int i = 1; i < numOfHeightDim; i++)
        {
            cin >> data[i];

            if(data[i - 1] >= data[i])
            {
                currentHeightDim = data[i];
            }
            else if(data[i] - currentHeightDim > maxHeight)
            {
                getline(cin, aux);
                adequate = false;
                break;
            }
        }
        
        if(adequate)
        {
            cout << "APTA" << endl;
        }
        else
        {
            cout << "NO APTA" << endl;
        }
        
    }

    return 0;
}