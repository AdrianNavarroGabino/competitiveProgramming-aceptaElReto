// Adrián Navarro Gabino

import java.util.*;

public class Challenge0485
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] stages;
        int distance, numOfStages;
        
        do
        {
            numOfStages = sc.nextInt();
            
            if(numOfStages != 0)
            {
                distance = 0;
                stages = new int[numOfStages];
                
                for(int i = 0; i < numOfStages; i++)
                {
                    stages[i] = sc.nextInt();
                    distance += stages[i];
                }
                
                System.out.print(distance);
                
                for(int i = 0; i < numOfStages - 1; i++)
                {
                    distance -= stages[i];
                    System.out.print(" " + distance);
                }
                
                System.out.println();
            }
        } while(numOfStages != 0);
    }
}
