// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0354
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int highest, lowest, kids;

        int cases = sc.nextInt();

        while(cases != 0)
        {
            int[] heights = new int[cases];

            for(int i = 0; i < cases; i++)
            {
                heights[i] = sc.nextInt();
            }

            kids = 1;
            highest = heights[0];
            lowest = heights[0];

            for(int i = 1; i < cases; i++)
            {
                if(heights[i] <= lowest)
                {
                    lowest = highest;
                    kids = i + 1;
                }

                if(heights[i] > highest)
                {
                    highest = heights[i];
                }
            }

            System.out.println(kids);

            cases = sc.nextInt();
        }
    }
}