// Adrián Navarro Gabino

import java.util.*;

public class Challenge0185
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cases;
        
        do
        {
            cases = sc.nextInt();
            sc.nextLine();

            if(cases != 0)
            {
                List<String> yes = new ArrayList<String>();
                List<String> no = new ArrayList<String>();

                for(int i = 0; i < cases; i++)
                {
                    String[] potito = sc.nextLine().split(" ");
                    if(potito[0].equals("SI:"))
                    {
                        for(int j = 1; j < potito.length - 1; j++)
                        {
                            yes.add(potito[j]);
                        }
                    }
                    else
                    {
                        for(int j = 1; j < potito.length - 1; j++)
                        {
                            if(!no.contains(potito[j]))
                                no.add(potito[j]);
                        }
                    }
                }

                Collections.sort(no);
                String result = "";

                for(String i: no)
                {
                    if(!yes.contains(i))
                    {
                        result += i + " ";
                    }
                }

                System.out.println(result.trim());
            }
        }while(cases != 0);
    }
}