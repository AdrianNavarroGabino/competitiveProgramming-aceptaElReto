// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0153
{
    public static void main(String[] args)
    {
        int hours, minutes, realHours, realMinutes;
        String auxHour;
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        sc.nextLine();
        
        for(int actualCase = 0; actualCase < cases; actualCase++)
        {
            auxHour = sc.nextLine();
            
            hours = Integer.parseInt(auxHour.substring(0,2));
            minutes = Integer.parseInt(auxHour.substring(3,5));
            
            realHours = 0;
            realMinutes = 0;
            
            if( (hours == 12 || hours == 6) && minutes == 0 )
            {
                realHours = hours;
                realMinutes = minutes;
            }
            else
            {
                realHours = 12 - hours - 1;
                if(realHours == -1)
                {
                    realHours = 11;
                }
                else if(realHours == 0)
                {
                    realHours = 12;
                }
                
                if(minutes == 0)
                {
                    realHours++;
                    realHours %= 12;
                    realMinutes = 0;
                }
                else
                {
                    realMinutes = 60 - minutes;
                }
            }
            
            System.out.printf("%02d:%02d\n", realHours, realMinutes);
        }
    }
}
