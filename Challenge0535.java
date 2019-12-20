// Adrián Navarro Gabino

import java.util.*;

public class Challenge0535
{
    public static void main(String[] args)
    {
        int a, mayor, result;
        Scanner sc = new Scanner(System.in);
        int[] b;

        do {
            a = sc.nextInt();
            if(a != 0)
            {
                b = new int[a];
                result = 0;
                
                for(int i = 0; i < a; i++)
                {
                    b[i] = sc.nextInt();
                }
                
                mayor = b[a - 1];
                
                for(int i = 0; i < a; i++)
                {
                    result += mayor - b[i];
                }
                
                System.out.println(result);
            }
        } while (a != 0);
    }
}
