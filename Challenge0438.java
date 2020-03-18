// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0438
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String message;
        short letters, exclamations;

        while(sc.hasNext())
        {
            letters = 0;
            exclamations = 0;
            message = sc.nextLine().toUpperCase();

            for(int i = 0; i < message.length(); i++)
            {
                if(message.charAt(i) == '!')
                {
                    exclamations++;
                }
                else if(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')
                {
                    letters++;
                }
            }

            System.out.println(exclamations > letters ? "ESGRITO" : "escrito");
        }
    }
}