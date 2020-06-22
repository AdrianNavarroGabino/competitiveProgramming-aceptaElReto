// Adrián Navarro Gabino

import java.util.*;

public class Challenge0237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        boolean isMultidivisible;
        
        while(sc.hasNext()) {
            number = sc.nextLine();
            isMultidivisible = true;

            for(int i = 0; i < number.length(); i++) {
                if(Long.parseLong(number.substring(0, number.length() - i)) %
                        (number.length() - i) != 0) {
                    isMultidivisible = false;
                    break;
                }
            }

            System.out.println(isMultidivisible ?
                "POLIDIVISIBLE" : "NO POLIDIVISIBLE");
        }
    }
}