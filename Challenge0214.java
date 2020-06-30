// Adrián Navarro Gabino

import java.util.*;

public class Challenge0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfKings, numOfAspirants;
        String[] kings, aspirants;
        Map<String, Integer> kingNumber;

        numOfKings = sc.nextInt();
        sc.nextLine();

        while(numOfKings != 0) {
            kings = sc.nextLine().split(" ");

            numOfAspirants = sc.nextInt();
            sc.nextLine();
            aspirants = sc.nextLine().split(" ");

            kingNumber = new HashMap<>();

            for(String king: kings) {
                if(kingNumber.containsKey(king)) {
                    kingNumber.put(king, kingNumber.get(king) + 1);
                }
                else {
                    kingNumber.put(king, 1);
                }
            }

            for(String aspirant: aspirants) {
                if(kingNumber.containsKey(aspirant)) {
                    kingNumber.put(aspirant, kingNumber.get(aspirant) + 1);
                }
                else {
                    kingNumber.put(aspirant, 1);
                }
                System.out.println(kingNumber.get(aspirant));
            }
            System.out.println();

            numOfKings = sc.nextInt();
            sc.nextLine();
        }
    }
}