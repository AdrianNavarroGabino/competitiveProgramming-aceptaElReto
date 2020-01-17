// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0539
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int firstYear, currentYear;
		
		while(sc.hasNext())
		{
			firstYear = sc.nextInt();
			currentYear = sc.nextInt();
			
			currentYear = currentYear - firstYear + 1;
			
			if(currentYear % 10 == 0)
			{
				System.out.println("FELIZ DECADA NUEVA");
			}
			else
			{
				System.out.println("TOCA ESPERAR");
			}
		}
	}
}
