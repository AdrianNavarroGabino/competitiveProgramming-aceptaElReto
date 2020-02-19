// Adrián Navarro Gabino

import java.util.*;

public class Challenge0234
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases, batteries, volts, highIndex, lowIndex, numberOfCars;
		int[] data;
		
		cases = sc.nextInt();
		
		for(int index = 0; index < cases; index++)
		{
			batteries = sc.nextInt();
			volts = sc.nextInt();
			data = new int[batteries];
			
			for(int i = 0; i < batteries; i++)
			{
				data[i] = sc.nextInt();
			}
			
			Arrays.sort(data);
			
			highIndex = batteries - 1;
			lowIndex = 0;
			numberOfCars = 0;
			
			while(lowIndex < highIndex)
			{
				if(data[lowIndex] + data[highIndex] >= volts)
				{
					highIndex--;
					numberOfCars++;
				}
				lowIndex++;
			}
			
			System.out.println(numberOfCars);
		}
	}
}
