// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0148
{
    public static void main(String[] args)
    {
        String auxHour;
        int hour, minute;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            auxHour = sc.nextLine();
            
            if(!auxHour.equals("00:00"))
            {
                minute = Integer.parseInt(auxHour.split(":")[1]);
                hour = minute == 0 ? Integer.parseInt(auxHour.split(":")[0]) :
                    (Integer.parseInt(auxHour.split(":")[0]) + 25) % 24;
                
                System.out.println((24 - hour) % 24 * 60 + (60 - minute) % 60);
            }
        } while(!auxHour.equals("00:00"));
    }
}
