// Adrián Navarro Gabino

import java.util.*;

public class Challenge0467
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        String[] sentence;
        
        for(int i = 0; i < cases; i++)
        {
            sentence = sc.nextLine().split(" ");
            
            if(sentence[0].equalsIgnoreCase(sentence[2]))
            {
                System.out.println("TAUTOLOGIA");
            }
            else
            {
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
