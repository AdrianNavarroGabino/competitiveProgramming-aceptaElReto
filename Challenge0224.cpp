// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int slices;
    int greatest;
    int position;
    int i;
    int j;
    int subtotal;
    
    do
    {
        cin >> slices;
        
        if(slices != 0)
        {
            int sliceSize[slices];
            
            for(int i = 0; i < slices; i++)
            {
                cin >> sliceSize[i];
            }
            
            
            greatest = 0;
            position = 0;
            i = 0;
            
            while(i < slices)
            {
                subtotal = 0;
                    
                j = i + 1;
                
                while(subtotal <= sliceSize[i] && j < slices)
                {
                    subtotal += sliceSize[j];
                    j++;
                }
                
                if(sliceSize[i] == subtotal && subtotal > greatest)
                {
                    greatest = subtotal;
                    position = i + 1;
                }
                
                i++;
            }
            
            if(greatest != 0)
            {
                cout << "SI " << position << endl;
            }
            else
            {
                cout << "NO" << endl;
            }
        }
    } while(slices != 0);
}
