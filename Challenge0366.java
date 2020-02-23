// Adrián Navarro Gabino

import java.util.*;

public class Challenge0366
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberOfKids = sc.nextInt();

        while(numberOfKids != 0)
        {
            Kid[] kids = new Kid[numberOfKids];

            for(int i = 0; i < numberOfKids; i++)
            {
                kids[i] = new Kid(sc.nextShort(), sc.nextShort());
            }

            Arrays.sort(kids);

            for(Kid k: kids)
            {
                System.out.println(k);
            }
            System.out.println();

            numberOfKids = sc.nextInt();
        }
    }
}

class Kid implements Comparable<Kid>
{
    private short good;
    private short giftsWeight;

    public Kid(short good, short giftsWeight)
    {
        this.good = good;
        this.giftsWeight = giftsWeight;
    }

    @Override
    public int compareTo(Kid k2)
    {
        if(this.good == k2.good)
        {
            return (int) (this.giftsWeight - k2.giftsWeight);
        }
        return (int) (k2.good - this.good);
    }
    
    @Override
    public String toString() {
        return good + " " + giftsWeight;
    }
}
