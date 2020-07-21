// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days =
            {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        double[] money = new double[6];
        double avg;
        int max, min;
        boolean tieMin, tieMax;
        money[0] = sc.nextDouble();

        while(money[0] != -1) {
            min = max = 0;
            avg = money[0];
            tieMin = tieMax = false;
            for(int i = 1; i < 6; i++) {
                money[i] = sc.nextDouble();
                avg += money[i];

                if(money[i] < money[min]) {
                    min = i;
                    tieMin = false;
                }
                else if(money[i] == money[min]) {
                    tieMin = true;
                }
                
                if(money[i] > money[max]) {
                    max = i;
                    tieMax = false;
                }
                else if(money[i] == money[max]) {
                    tieMax = true;
                }
            }

            System.out.print(tieMax ? "EMPATE" : days[max]);
            System.out.print(" " + (tieMin ? "EMPATE" : days[min]));
            System.out.println(" " + (money[5] > avg / 6 ? "SI" : "NO"));

            money[0] = sc.nextDouble();
        }
    }
}