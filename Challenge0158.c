// Adrian Navaro Gabino

#include <stdio.h>

int main()
{
    int casosPrueba, tamanyo, saltoUp, saltoDown, i, j;
    scanf("%d", &casosPrueba);
    
    for(i = 0; i < casosPrueba; i++)
    {
        saltoUp = 0;
        saltoDown = 0;
        
        scanf("%d", &tamanyo);
        
        int muros[tamanyo];
        
        for(j = 0; j < tamanyo; j++)
        {
            scanf("%d", &muros[j]);
        }
        
        for(j = 1; j < tamanyo; j++)
        {
            if(muros[j] < muros[j-1])
            {
                saltoDown++;
            }
            else if(muros[j] > muros[j-1])
            {
                saltoUp++;
            }
        }
        
        printf("%d %d\n", saltoUp, saltoDown);
    }
}
