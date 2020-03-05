// Adrián Navarro Gabino

import java.util.*;

public class Challenge0521
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int floors = sc.nextInt();
        int letters = sc.nextInt();
        int assistants = sc.nextInt();
        sc.nextLine();

        String[] data;
        List<String> data2;

        while(floors != 0)
        {
            data = sc.nextLine().split(" ");

            if(assistants < (floors * letters + 1) / 2)
            {
                System.out.println("ESPERAMOS");
            }
            else
            {
                data2 = new ArrayList<>();

                for(int i = 0; i < data.length; i += 2)
                {
                    if(!data2.contains(data[i] + data[i + 1]))
                    {
                        data2.add(data[i] + data[i + 1]);
                    }
                }

                System.out.println(data2.size() >= (floors * letters + 1) / 2 ?
                    "EMPEZAMOS" : "ESPERAMOS");
            }

            floors = sc.nextInt();
            letters = sc.nextInt();
            assistants = sc.nextInt();
            sc.nextLine();
        }
    }
}