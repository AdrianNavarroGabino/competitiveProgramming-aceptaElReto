// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0333
{
	public static boolean isCapicua(String num)
	{
		if(num.charAt(0) == '0' && num.length() > 1)
		{
			return false;
		}
		
		String numAux = "";
		
		for(int i = 0; i < num.length(); i++)
		{
			numAux = num.charAt(i) + numAux;
		}
		
		if(numAux.equals(num))
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String num, num1, num2;
		boolean found;
		num = sc.nextLine();
		
		while(!num.equals("0"))
		{
			found = false;
			for(int i = 1; i < num.length(); i++)
			{
				num1 = num.substring(0, i);
				num2 = num.substring(i, num.length());
				if(isCapicua(num1) && isCapicua(num2))
				{
					found = true;
					System.out.println("SI");
					break;
				}
			}
			
			if(!found)
				System.out.println("NO");
			
			num = sc.nextLine();
		}
	}
}
