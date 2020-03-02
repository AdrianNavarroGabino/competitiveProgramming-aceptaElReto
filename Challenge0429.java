// Adrián Navarro Gabino

import java.util.*;

public class Challenge0429
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numberOfShips, ship;
        int numberOfHangars = sc.nextInt();
        boolean ok;

        while(numberOfHangars != 0)
        {
            ok = true;
            int[] hangars = new int[numberOfHangars];

            for(int i = 0; i < numberOfHangars; i++)
            {
                hangars[i] = sc.nextInt();
            }

            numberOfShips = sc.nextInt();

            for(int i = 0; i < numberOfShips; i++)
            {
                Arrays.sort(hangars);
                ship = sc.nextInt();

                if(hangars[numberOfHangars - 1] - ship < 0)
                {
                    sc.nextLine();
                    ok = false;
                    break;
                }

                hangars[numberOfHangars - 1] -= ship;
            }

            if(ok)
            {
                System.out.println("SI");
            }
            else
            {
                System.out.println("NO");
            }

            numberOfHangars = sc.nextInt();
        }
    }
}