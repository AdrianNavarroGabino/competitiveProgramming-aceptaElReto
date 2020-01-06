// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0513
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int average, cases, aux;
		
		while(sc.hasNext())
		{
			cases = sc.nextInt();
			
			average = sc.nextInt();
			System.out.print(average);
			
			for(int i = 2; i <= cases; i++)
			{
				aux = average;
				average = sc.nextInt();
				
				System.out.print(" " + (i * average - (i - 1) * aux));
			}
			
			System.out.println();
		}
	}
}
