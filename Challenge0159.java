// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0159
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        short h1, h2, m1, m2;
        short num;
        int times;

        while(!input[0].equals("24:00") || !input[1].equals("24:00"))
        {
            times = 0;
            num = Short.parseShort(input[2]);

            h1 = Short.parseShort(input[0].split(":")[0]);
            m1 = Short.parseShort(input[0].split(":")[1]);
            h2 = Short.parseShort(input[1].split(":")[0]);
            m2 = Short.parseShort(input[1].split(":")[1]);

            if(h1 != h2)
            {
                if(h1 / 10 == num || h1 % 10 == num)
                {
                    times += (60 - m1);
                }
                else
                {
                    for(int i = m1; i < 60; i++)
                    {
                        if(i / 10 == num || i % 10 == num)
                        {
                            times++;
                        }
                    }
                }

                for(int i = h1 + 1; i < h2; i++)
                {
                    if(i / 10 == num || i % 10 == num)
                    {
                        times += 60;
                    }
                    else
                    {
                        if(num < 6)
                            times += 15;
                        else
                            times += 6;
                    }
                }

                if(h2 / 10 == num || h2 % 10 == num)
                {
                    times += (m2 + 1);
                }
                else
                {
                    for(int i = 0; i <= m2; i++)
                    {
                        if(i / 10 == num || i % 10 == num)
                        {
                            times++;
                        }
                    }
                }
            }
            else
            {
                if(h1 / 10 == num || h1 % 10 == num)
                {
                    times += (m2 - m1 + 1);
                }
                else
                {
                    for(int i = m1; i <= m2; i++)
                    {
                        if(i / 10 == num || i % 10 == num)
                        {
                            times++;
                        }
                    }
                }
            }

            System.out.println(times);

            input = sc.nextLine().split(" ");
        }
    }
}