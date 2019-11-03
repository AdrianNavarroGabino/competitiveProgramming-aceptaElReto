// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0165
{
    public static boolean checkHypereven(String number)
    {
        for(int i = 0; i < number.length(); i++)
        {
            if(Integer.parseInt(number.charAt(i) + "") % 2 != 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args)
    {
        String number;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            number = sc.nextLine();
            
            if(!number.startsWith("-"))
            {
                if(checkHypereven(number))
                {
                    System.out.println("SI");
                }
                else
                {
                    System.out.println("NO");
                }
            }
        }while(!number.startsWith("-"));
    }
}
