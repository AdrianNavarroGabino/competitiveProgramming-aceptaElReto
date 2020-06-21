// Adrián Navarro Gabino

import java.util.*;

public class Challenge0238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bills, numOfPeople, data;
        int[] people;
        String[] result;

        bills = sc.nextInt();

        while(bills != 0) {
            numOfPeople = sc.nextInt();

            people = new int[numOfPeople];
            Arrays.fill(people, 0);
            result = new String[numOfPeople];
            Arrays.fill(result, " ");

            for(int i = 0; i < bills; i++) {
                data = sc.nextInt();
                people[i % numOfPeople] += data;
                result[i % numOfPeople] += data + " ";
            }

            for(int i = 0; i < numOfPeople; i++) {
                result[i] = result[i].substring(0, result[i].length() - 1);
                System.out.println(people[i] + ":" + result[i]);
            }
            System.out.println("---");

            bills = sc.nextInt();
        }
    }
}