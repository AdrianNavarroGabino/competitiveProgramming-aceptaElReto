// Adrián Navarro Gabino

#include <stdio.h>

int main()
{
    short int i, j;
    
    int cases;
    scanf("%d", &cases);
    
    int row1[6];
    int row2[6];
    
    int sum;
    int yes;
    
    for(i = 0; i < cases; i++)
    {
        yes = 0;
        
        for(j = 0; j < 6; j++)
        {
            scanf("%d", &row1[j]);
        }
        for(j = 0; j < 6; j++)
        {
            scanf("%d", &row2[j]);
        }
        
        sum = row1[0] + row2[0];
        
        for(j = 0; j < 6; j++)
        {
            if(row1[j] + row2[j] != sum)
            {
                yes = 1;
            }
        }
        
        if(yes == 0)
        {
            printf("SI\n");
        }
        else
        {
            printf("NO\n");
        }
    }
}
