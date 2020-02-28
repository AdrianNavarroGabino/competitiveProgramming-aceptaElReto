// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0222
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num, pow, powResult, result;

        while(sc.hasNext())
        {
            num = sc.nextInt();
            pow = sc.nextInt();

            result = 1;
            powResult = 1;

            for(int i = 1; i <= pow; i++)
            {
                powResult *= num;
                powResult %= 1000007;
                result += powResult;
                result %= 1000007;
            }

            System.out.println(result);
        }
    }
}