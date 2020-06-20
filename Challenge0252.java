// Adrián Navarro Gabino

import java.util.*;

public class Challenge0252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome;
        String sentenceAux = sc.nextLine();
        char[] sentence;
        int i, j;

        while(!sentenceAux.equals("XXX")) {
            System.out.println(sentenceAux);
            sentence = sentenceAux.toUpperCase().toCharArray();
            isPalindrome = true;
            i = 0;
            j = sentence.length - 1;

            while(i <= j) {
                if(sentence[i] < 'A' || sentence[i] > 'Z') {
                    i++;
                    continue;
                }
                if(sentence[j] < 'A' || sentence[j] > 'Z') {
                    j--;
                    continue;
                }
                if(sentence[i] != sentence[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            System.out.println(isPalindrome ? "SI" : "NO");
            sentenceAux = sc.nextLine();
        }
    }
}