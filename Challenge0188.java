// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0188
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] words;
		boolean right;
		
		while(sc.hasNext())
		{
			words = sc.nextLine().split(" ");
			right = true;
			
			for(int i = 0; i < words.length - 1; i++)
			{
				if(!words[i].substring(words[i].length() - 2)
						.equals(words[i + 1].substring(0, 2)))
				{
					right = false;
					break;
				}
			}
			
			if(right)
			{
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
