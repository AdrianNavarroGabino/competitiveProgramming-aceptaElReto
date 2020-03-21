// Adrián Navarro Gabino

import java.util.*;

public class Challenge0431
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int numOfFamilies = sc.nextInt();
        int numOfKids, parentsMid, kid, aux;

        while(numOfFamilies != 0)
        {
            Integer[] families = new Integer[numOfFamilies];

            for(int i = 0; i < numOfFamilies; i++)
            {
                numOfKids = sc.nextInt();
                parentsMid = sc.nextInt();
                kid = sc.nextInt();
                for(int j = 1; j < numOfKids; j++)
                {
                    aux = sc.nextInt();
                    kid = aux > kid ? aux : kid;
                }
                families[i] = kid * parentsMid;
            }

            Arrays.sort(families, Collections.reverseOrder());

            System.out.print(families[0]);
            for(int i = 1; i < numOfFamilies; i++)
            {
                System.out.print(" " + families[i]);
            }
            System.out.println();

            numOfFamilies = sc.nextInt();
        }
    }
}