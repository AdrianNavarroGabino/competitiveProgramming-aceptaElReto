// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0512
{
    public static void main(String[] args)
    {
        int conejo, caballo;
        String[] kilos;
        
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        sc.nextLine();
        
        for(int indice = 0; indice < cases; indice++)
        {
            kilos = sc.nextLine().split(" ");
            conejo = Integer.parseInt(kilos[0]);
            caballo = Integer.parseInt(kilos[1]);
            
            System.out.println((conejo * 100) / (conejo + caballo));
        }
    }
    
}
