// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0520
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int cubos, bolita, pos1, pos2;
        
        do
        {
            
            cubos = sc.nextInt();
            bolita = sc.nextInt();
            sc.nextLine();
            if(cubos != 0 && bolita != 0)
            {
                do
                {
                    pos1 = sc.nextInt();
                    pos2 = sc.nextInt();
                    
                    if(pos1 == bolita)
                        bolita = pos2;
                    else if (pos2 == bolita)
                        bolita = pos1;
                } while(pos1 != 0 && pos2 != 0);
                
                System.out.println(bolita);
            }
        } while(cubos != 0 && bolita != 0);
    }
}
