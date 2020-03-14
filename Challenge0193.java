// Adrián Navarro Gabino

import java.util.*;

public class Challenge0193
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String numInv, numResult;
        int num1, num2;
        boolean yes;

        while(!num.equals("0"))
        {
            if(num.charAt(num.length() - 1) == '0')
            {
                System.out.println("NO");
            }
            else
            {
                numInv = "";

                for(int i = 0; i < num.length(); i++)
                {
                    numInv = num.charAt(i) + numInv;
                }

                num1 = Integer.parseInt(num);
                num2 = Integer.parseInt(numInv);

                numResult = Integer.toString(num1 + num2);

                yes = true;

                for(int i = 0; i < numResult.length(); i++)
                {
                    if(Integer.parseInt(numResult.charAt(i) + "") % 2 == 0)
                    {
                        yes = false;
                        break;
                    }
                }

                if(yes)
                {
                    System.out.println("SI");
                }
                else
                {
                    System.out.println("NO");
                }
            }

            num = sc.nextLine();
        }
    }
}