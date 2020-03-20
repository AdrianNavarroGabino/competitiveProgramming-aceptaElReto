// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0416
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        String[] dates;
        short[] birthdays;
        boolean repeated;

        while(cases != 0)
        {
            sc.nextLine();

            repeated = false;
            dates = sc.nextLine().split(" ");
            birthdays = new short[cases * 2];

            for(int i = 0; i < cases; i++)
            {
                birthdays[2 * i] = Short.parseShort(dates[i].split("/")[0]);
                birthdays[2 * i + 1] = Short.parseShort(dates[i].split("/")[1]);
            }

            for(int i = 0; i < cases - 1; i++)
            {
                for(int j = i + 1; j < cases; j++)
                {
                    if(birthdays[2 * i] == birthdays[2 * j] && 
                        birthdays[2 * i + 1] == birthdays[2 * j + 1])
                    {
                        repeated = true;
                        break;
                    }
                }

                if(repeated)
                {
                    break;
                }
            }

            System.out.println(repeated ? "SI" : "NO");

            cases = sc.nextInt();
        }
    }
}