// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0178
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int currentIndex;
        boolean found;

        int cases = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < cases; index++)
        {
            s1 = sc.nextLine().toLowerCase();
            s2 = sc.nextLine().toLowerCase().replace(" ", "");
            currentIndex = 0;
            found = true;

            for(int i = 0; i < s2.length(); i++)
            {
                currentIndex = s1.indexOf(s2.charAt(i), currentIndex) + 1;
                
                if(currentIndex == 0)
                {
                    found = false;
                    break;
                }
            }

            if(found)
            {
                System.out.println("SI");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}