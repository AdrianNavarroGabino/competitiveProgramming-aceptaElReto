// Adrián Navarro Gabino

import java.util.*;

public class Challenge0233
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result, result2;
        String resultAux;

        while(num != 0)
        {
            result = num;

            resultAux = 1 + (new String(new char[Integer.toString(result).length() - 1]). replace("\0","9"));
            
            if(num % 9 != 0)
            {
                System.out.print(num % 9);
            }

            for(int i = 0; i < num / 9; i++)
            {
                System.out.print("9");
            }

            System.out.println();

            num = sc.nextInt();
        }
    }
}