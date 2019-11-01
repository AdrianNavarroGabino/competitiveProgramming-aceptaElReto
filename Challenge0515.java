// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0515
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int copas, contador, turno;
        
        do
        {
            copas = sc.nextInt();
            if(copas != 0)
            {
                contador = 0;
                turno = 0;
                if(copas > 2)
                {
                    while(copas > 2)
                    {
                        copas--;
                        turno++;
                    }
                    
                    if(turno % 2 == 0)
                        turno += 2;
                    else
                        turno++;
                    
                    System.out.println(turno);
                }
                else
                    System.out.println(copas);
            }
        } while(copas != 0);
    }
    
}
