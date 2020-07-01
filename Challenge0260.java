// Adrián Navarro Gabino

import java.util.*;

public class Challenge0260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] sentence1, sentence2;

        int cases = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < cases; index++) {
            sentence1 = sc.nextLine()
                .toLowerCase().replace(" ", "").toCharArray();
            sentence2 = sc.nextLine()
                .toLowerCase().replace(" ", "").toCharArray();

            Arrays.sort(sentence1);
            Arrays.sort(sentence2);

            System.out.println(
                (new String(sentence1)).equals(new String(sentence2)) ?
                    "SI" : "NO");
        }
    }
}