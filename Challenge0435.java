// Adrián Navarro Gabino

import java.util.Arrays;
import java.util.Scanner;

public class Challenge0435 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] number;
        char letter;
        int concurrence, aux;
        boolean isSubnormal;
        
        while(sc.hasNext()) {
            number = sc.nextLine().toCharArray();
            Arrays.sort(number);
            isSubnormal = true;

            letter = number[0];
            concurrence = 1;

            for(int i = 1; i < number.length; i++) {
                if(number[i] != letter) {
                    break;
                }
                concurrence++;
            }

            aux = 0;

            for(int i = 0; i < number.length; i++) {
                if(number[i] != letter) {
                    if(concurrence != aux) {
                        isSubnormal = false;
                        break;
                    }

                    letter = number[i];
                    aux = 0;
                }

                aux++;
            }

            System.out.println(isSubnormal && aux == concurrence &&
                number.length / aux == 10 ? "subnormal" : "no subnormal");
        }
	}
}