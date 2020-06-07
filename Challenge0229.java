// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0229 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cases = sc.nextInt();
        int[] movements;
        int movement, count;
        double moneyTest;

        while(cases != 0) {
            movements = new int[cases + 1];
            movements[0] = 0;
            for(int i = 1; i <= cases; i++) {
                movement = sc.nextInt();
                movements[i] = movements[i - 1] + movement;
            }

            count = 0;
            moneyTest = movements[cases] / 2.0;

            for(int i = 0; i <= cases; i++) {
                if(movements[i] == moneyTest) {
                    count++;
                }
            }

            System.out.println(count);

            cases = sc.nextInt();
        }
	}
}