// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0506
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] data;
		int cases = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < cases; i++)
		{
			data = sc.nextLine().split(" / ");
			
			if(Short.parseShort(data[0]) < Short.parseShort(data[1]))
			{
				System.out.println("MAL");
			}
			else
			{
				System.out.println("BIEN");
			}
		}
	}
}
