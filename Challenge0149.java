// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0149
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases, speed, maximum;
		
		while(sc.hasNext())
		{
			cases = sc.nextInt();
			maximum = 0;
			
			for(int i = 0; i < cases; i++)
			{
				speed = sc.nextInt();
				if(maximum < speed)
				{
					maximum = speed;
				}
			}
			
			System.out.println(maximum);
		}
	}
}
