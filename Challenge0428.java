// Adrián Navarro Gabino

import java.util.*;

public class Challenge0428
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int midichlorians, count;

        for(int index = 0; index < cases; index++)
        {
            count = 0;
            midichlorians = sc.nextInt();

            while(count < 2 && midichlorians != 0)
            {
                if(midichlorians % 5 == 4)
                {
                    count++;
                }

                midichlorians /= 5;
            }

            if(count > 1)
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