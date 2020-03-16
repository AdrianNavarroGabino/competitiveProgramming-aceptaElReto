// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0124
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");
        short minLength, wholeDiv, total;

        while(!nums[0].equals("0") || !nums[1].equals("0"))
        {
            minLength = nums[0].length() < nums[1].length() ? (short)nums[0].length() : (short)nums[1].length();
            wholeDiv = 0;
            total = 0;

            for(int i = 0; i < minLength; i++)
            {
                wholeDiv =
                    (short)((Short.parseShort(
                        nums[0].charAt(nums[0].length() - i - 1) + "") +
                    Short.parseShort(
                        nums[1].charAt(nums[1].length() - i - 1) + "") +
                    wholeDiv) / 10);

                total += wholeDiv;
            }

            int i = minLength;

            if(nums[0].length() > minLength)
            {
                while(wholeDiv != 0 && i <= nums[0].length() - 1)
                {
                    wholeDiv = (short)((Short.parseShort(
                            nums[0].charAt(nums[0].length() - i - 1) + "") +
                        wholeDiv) / 10);

                    total += wholeDiv;
                    i++;
                }
            }
            else if(nums[1].length() > minLength)
            {
                while(wholeDiv != 0 && i <= nums[1].length() - 1)
                {
                    wholeDiv = (short)((Short.parseShort(
                            nums[1].charAt(nums[1].length() - i - 1) + "") +
                        wholeDiv) / 10);
                    
                    total += wholeDiv;
                    i++;
                }
            }

            System.out.println(total);

            nums = sc.nextLine().split(" ");
        }
    }
}