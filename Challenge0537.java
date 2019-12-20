// Adrián Navarro Gabino

import java.util.*;

public class Challenge0537
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int puntosInteres, carriles, p1, p2;
        int[][] puntos;
        
        while(sc.hasNext())
        {
            puntosInteres = sc.nextInt();
            carriles = sc.nextInt();
            puntos = new int[carriles * 2][];
            for(int i = 0; i < carriles * 2; i += 2)
            {
                p1 = sc.nextInt();
                p2 = sc.nextInt();
                
                puntos[i] = new int[]{p1, p2};
                puntos[i + 1] = new int[]{p2, p1};
            }
            
            List<Integer> lista = new ArrayList<Integer>();
            
            lista.add(1);
            
            int current = 0;
            
            for(int i = 0; i < lista.size(); i++)
            {
                for(int j = 0; j < puntos.length; j++)
                {
                    if(!lista.contains(puntos[j][1]) && lista.get(i) == puntos[j][0])
                    {
                        lista.add(puntos[j][1]);
                    }
                }
            }
            boolean a = true;
            
            for(int i = 1; i <= puntosInteres; i++)
            {
                if(!lista.contains(i))
                {
                    a = false;
                    break;
                }
            }
            
            if(a)
            {
                System.out.println("BICI");
            }
            else
            {
                System.out.println("A PIE");
            }
        }
    }
}
