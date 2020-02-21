// Adrián Navarro Gabino

import java.util.*;

public class Challenge0417
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word;
		boolean found;
		Short result = 0;
		
		while(sc.hasNext())
		{
			word = sc.nextLine().toLowerCase();
			
			for(short f = 1; f <= word.length(); f++)
			{
				if(word.length() % f == 0)
				{
					found = true;
					String aux = word.substring(0, f);
					
					for(short i = (short)(2 * f); i <= word.length(); i += f)
					{
						if(!aux.equals(word.substring(i - f, i)))
						{
							found = false;
							break;
						}
					}
					
					if(found)
					{
						result = f;
						break;
					}
				}
			}
			
			System.out.println(result);
		}
	}
}
