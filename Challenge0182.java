// Adrián Navarro Gabino

import java.util.*;

public class Challenge0182
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        int persistance, num;
        String numAux;
        
        for(int i = 0; i < cases; i++)
        {
            persistance = 0;
            numAux = sc.nextLine();
            
            while(numAux.length() > 1)
            {
                persistance++;
                num = 1;
                
                for(int j = 0; j < numAux.length(); j++)
                {
                    num *= Integer.parseInt("" + numAux.charAt(j));
                }
                
                numAux = Integer.toString(num);
            }
            
            System.out.println(persistance);
        }
    }
}
