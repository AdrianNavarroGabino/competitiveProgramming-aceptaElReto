// Adrián Navarro Gabino

#include <stdio.h>
#include <math.h>

int main()
{
    int grapes;
    double level;
    
    do
    {
        scanf("%d", &grapes);
        
        if(grapes != 0)
        {
            level = (-1 + sqrt(1 + 8 * grapes)) / 2;
            
            printf("%d\n", (int)ceil(level));
        }
    } while(grapes != 0);
    
    return 0;
}
