// Adrián Navarro Gabino

import java.util.*;

public class Challenge0388
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int cells, highest;
        int[] positions;
        
        do
        {
            cells = sc.nextInt();
            positions = new int[cells * 2];
            
            if(cells != 0)
            {
                for(int i = 0; i < cells * 2; i += 2)
                {
                    positions[i] = sc.nextInt();
                    positions[i + 1] = sc.nextInt();
                }
                
                highest = 0;
                
                for(int i = 0; i < cells * 2; i += 2)
                {
                    for(int j = i + 2; j < cells * 2; j += 2)
                    {
                        if(Math.abs(positions[i] - positions[j]) + Math.abs(positions[i + 1] - positions[j + 1]) > highest)
                            highest = Math.abs(positions[i] - positions[j]) + Math.abs(positions[i + 1] - positions[j + 1]);
                    }
                }
                
                System.out.println(highest);
            }
        }while(cells != 0);
    }
}
