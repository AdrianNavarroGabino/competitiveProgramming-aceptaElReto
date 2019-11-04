// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0344
{
    public static void main(String[] args)
    {
        String wires;
        int result;
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        
        for(int index = 0; index < cases; index++)
        {
            result = 0;
            sc.nextLine();
            wires = sc.nextLine().replace(" ", "");
            
            for(int i = 0; i < wires.length(); i++)
            {
                if(wires.charAt(i) == 'H')
                {
                    result++;
                }
                else
                {
                    result--;
                }
            }
            
            if(result == 0)
            {
                System.out.println("POSIBLE");
            }
            else
            {
                System.out.println("IMPOSIBLE");
            }
        }
    }
}
