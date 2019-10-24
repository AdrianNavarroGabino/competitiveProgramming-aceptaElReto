// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int columns;
    int rows;
    int count;
    int notMine;
    int x;
    int y;
    
    do
    {
        count = 0;
        
        cin >> columns >> rows;
        
        if(columns != 0 && rows != 0)
        {
            char table[rows][columns];
            
            for(int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    cin >> table[i][j];
                }
            }
            
            x = rows - 1;
            y = columns - 1;
            for(int i = 1; i < x; i++)
            {
                for(int j = 1; j < y; j++)
                {
                    notMine = 0;
                    
                    if(table[i][j] == '-')
                    {
                        for(int k = -1; k <= 1; k++)
                        {
                            for(int l = -1; l <= 1; l++)
                            {
                                notMine = table[i - k][j - l] == '-' ? 
                                    notMine + 1 : notMine;
                            }
                        }
                        
                        if(notMine < 4)
                        {
                            count++;
                        }
                    }
                }
            }
            
            cout << count << endl;
        }
    } while(columns != 0 && rows != 0);
    
    return 0;
}
