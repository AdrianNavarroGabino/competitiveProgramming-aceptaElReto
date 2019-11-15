// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0439
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int T, D, V;
        
        int cases = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < cases; i++)
        {
            T = 0;
            D = 0;
            V = 0;
            
            String[] input = sc.nextLine().split(" ");
            
            int num1 = Integer.parseInt(input[0].substring(2));
            int num2 = Integer.parseInt(input[1].substring(2));
            
            switch(input[0].charAt(0))
            {
                case 'T': T = num1; break;
                case 'D': D = num1; break;
                case 'V': V = num1; break;
            }
            
            switch(input[1].charAt(0))
            {
                case 'T': T = num2; break;
                case 'D': D = num2; break;
                case 'V': V = num2; break;
            }
            
            if(T == 0)
            {
                System.out.println("T=" + (D / V));
            }
            else if(D == 0)
            {
                System.out.println("D=" + (T * V));
            }
            else
            {
                System.out.println("V=" + (D / T));
            }
        }
    }
}
