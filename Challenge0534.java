// Adrián Navarro Gabino

import java.util.*;

public class Challenge0534
{
    public static void main(String[] args)
    {
        int cubos;
        Scanner sc = new Scanner(System.in);
        int[] datos;
        int mayor;

        do {
            mayor = 0;
            cubos = sc.nextInt();
            if(cubos != 0)
            {
                datos = new int[cubos];

                for(int i = 0; i < cubos; i++)
                {
                    datos[i] = sc.nextInt();
                }

                Arrays.sort(datos);

                for(int i = 0; i < cubos; i += 2)
                {
                    if(mayor < datos[i + 1] - datos[i])
                    {
                        mayor = datos[i + 1] - datos[i];
                    }
                }

                System.out.println(mayor);
            }
        } while (cubos != 0);
    }
}
