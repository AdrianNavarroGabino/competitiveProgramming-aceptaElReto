// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0442
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] data, data2;
		String aux;
		
		while(sc.hasNext())
		{
			data = sc.nextLine().split(" ");
			aux = data[0].charAt(0) + "";
			
			if(data[0].indexOf("-") != -1)
			{
				for(int i = 1; i < data[0].length(); i++)
				{
					if(data[0].charAt(i) == '-')
					{
						aux += " ";
					}
					else
					{
						aux += data[0].charAt(i);
					}
				}
			}
			else if(data[0].indexOf("_") != -1)
			{
				for(int i = 1; i < data[0].length(); i++)
				{
					if(data[0].charAt(i) == '_')
					{
						aux += " ";
					}
					else
					{
						aux += data[0].charAt(i);
					}
				}
			}
			else
			{
				for(int i = 1; i < data[0].length(); i++)
				{
					if(data[0].charAt(i) >= 'A' &&
							data[0].charAt(i) <= 'Z')
					{
						aux += " " + data[0].charAt(i);
					}
					else
					{
						aux += data[0].charAt(i);
					}
				}
			}
			
			aux = aux.toLowerCase();
			data2 = aux.split(" ");
			
			switch(data[1])
			{
				case "CamelCase":
					for(int i = 0; i < data2.length; i++)
					{
						System.out.print(
							data2[i].substring(0,1).toUpperCase() +
							data2[i].substring(1));
					}
					break;
				case "snake_case":
					System.out.print(data2[0]);
					for(int i = 1; i < data2.length; i++)
					{
						System.out.print("_" + data2[i]);
					}
					break;
				case "kebab-case":
					System.out.print(data2[0]);
					for(int i = 1; i < data2.length; i++)
					{
						System.out.print("-" + data2[i]);
					}
					break;
			}
			System.out.println();
		}
	}
}
