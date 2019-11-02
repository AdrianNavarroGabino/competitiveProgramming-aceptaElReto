// Adrián Navarro Gabino

#include <stdio.h>

int main()
{
    int rows;
    int toothpick;
    
    scanf("%d", &rows);
    
    while(rows != 0)
    {
        toothpick = (rows * (rows + 1) / 2) * 3;
        
        printf("%d\n", toothpick);
            
        scanf("%d", &rows);
    }
    
    return 0;
}
