// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0446 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        String[] data;
        boolean isGrandma;

        cases = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < cases; index++) {
            data = sc.nextLine().split(" ");
            isGrandma = true;

            if(!data[0].equals(data[data.length - 1]) || data.length == 3) {
                isGrandma = false;
            }
            else {
                for(int i = 2; i < data.length - 1; i++) {
                    if(data[0].equals(data[i])) {
                        isGrandma = false;
                        break;
                    }
                }
            }

            if(isGrandma) {
                System.out.println("VERDADERA");
            }
            else {
                System.out.println("FALSA");
            }
        }
	}
}