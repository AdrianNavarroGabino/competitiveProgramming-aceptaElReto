// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        sc.nextLine();
        String[] time;
        int hour, min, sec;

        for(int index = 0; index < cases; index++) {
            time = sc.nextLine().split(":");
            sec = 60 - Integer.parseInt(time[2]);
            min = 60 - Integer.parseInt(time[1]) - 1;
            hour = 24 - Integer.parseInt(time[0]) - 1;

            if(sec == 60) {
                sec = 0;
                min++;
            }

            if(min == 60) {
                min = 0;
                hour++;
            }

            if(min < 0) {
                min += 60;
                hour += 2;
            }

            hour %= 24;

            System.out.printf("%02d:%02d:%02d%n", hour, min, sec);
        }
    }
}