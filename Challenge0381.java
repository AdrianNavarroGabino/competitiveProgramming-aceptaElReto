// Adrián Navarro Gabino

import java.util.*;

public class Challenge0381
{
    public static int lcm(int n1, byte n2) {
        int x;
        int max = 0;
        int min = 0;
        int lcm = 0;
        
        if(n1 > n2)
        {
            max = n1;
            min = n2;
        }
        else
        {
            max = n2;
            min = n1;
        }
          
     
          
        for(int i=1;i<=min;i++)
        {
            x = max * i;
            
            if(x % min == 0) 
            {
                lcm = x; 
                break; 
            }
        }
        return lcm;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        byte cases;
        
        do
        {
            cases = sc.nextByte();
            if(cases != 0)
            {
                int lcm = lcm(sc.nextInt(), sc.nextByte());
                
                for(byte i = 2; i < cases; i++)
                {
                    lcm = lcm(lcm, sc.nextByte());
                }
                
                System.out.println(lcm);
            }
        } while(cases != 0);
    }
}
