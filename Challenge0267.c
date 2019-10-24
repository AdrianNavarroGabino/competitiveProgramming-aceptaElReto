// Adrián Navarro Gabino

#include <stdio.h>

int main()
{
    int ancho, alto, dist;
    scanf("%d", &ancho);
    scanf("%d", &alto);
    scanf("%d", &dist);
    
    int postes = 0;
    
    while(ancho != 0 || alto != 0 || dist != 0)
    {
        postes += (ancho / dist) * 2;
        postes += ancho % dist == 0 ? 0 : 2;
        postes += (alto / dist) * 2;
        postes += alto % dist == 0 ? 0 : 2;
        
        printf("%d\n", postes);
        
        scanf("%d", &ancho);
        scanf("%d", &alto);
        scanf("%d", &dist);
        postes = 0;
    }
}
