// Adrián Navarro Gabino

import java.util.*;

public class Challenge0458
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        long num1, num2;

        while(cases != 0)
        {
            int[] numbers = new int[cases];

            for(int i = 0; i < cases; i++)
            {
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers);

            num1 = (long)numbers[0] * (long)numbers[1];
            num2 = (long)numbers[cases - 2] * (long)numbers[cases - 1];

            System.out.println(num1 > num2 ? num1 : num2);

            cases = sc.nextInt();
        }
    }
}