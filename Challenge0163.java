// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0163
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String num, result;
		boolean one;
		
		num = sc.nextLine();
		
		while(!num.equals("FIN"))
		{
			result = "";
			one = true;
			
			for(int i = num.length() - 1; i >= 0; i--)
			{
				if(one)
				{
					if(num.charAt(i) == 'F')
					{
						result = "0" + result;
						if(i == 0)
						{
							result = '1' + result;
						}
					}
					else if(num.charAt(i) == '9')
					{
						result = 'A' + result;
						one = false;
					}
					else
					{
						result = (char)(num.charAt(i) + 1) + result;
						one = false;
					}
				}
				else
				{
					result = num.charAt(i) + result;
				}
			}
			
			System.out.println(result);
			
			num = sc.nextLine();
		}
	}
}
