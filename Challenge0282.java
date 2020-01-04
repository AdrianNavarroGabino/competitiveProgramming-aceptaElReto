// Adrián Navarro Gabino

import java.util.*;

public class Challenge0282
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int h, l, pos, result;
        int[] nums;
        
        while(sc.hasNext())
        {
            result = 1;
            
            h = sc.nextInt();
            l = sc.nextInt();
            nums = new int[h];
            
            for(int i = 0; i < h; i++)
            {
                nums[i] = sc.nextInt();
            }
            
            pos = nums[0];
            
            for(int i = 1; i < h; i++)
            {
                if(nums[i] - pos > l)
                {
                    pos = nums[i];
                    result++;
                }
            }
            
            System.out.println(result);
        }
    }
}
