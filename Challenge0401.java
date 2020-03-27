// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0401
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] words;
        String word1, word2;
        boolean equals;

        int cases = sc.nextInt();
        sc.nextLine();

        for(int index = 0; index < cases; index++)
        {
            equals = false;

            words = sc.nextLine().toLowerCase().replace("b", "v").split(" ");
            word1 = words[0];
            word2 = words[1];

            if(word1.length() != word2.length() || word1.equals(word2))
            {
                System.out.println("NO");
            }
            else
            {
                for(int i = 1; i <= word1.length(); i++)
                {
                    if(word1.substring(word1.length() - i).equals(word2.substring(0, i)))
                    {
                        if(word1.substring(0, word1.length() - i).equals(word2.substring(i)))
                        {
                            equals = true;
                            break;
                        }
                    }
                }

                System.out.println(equals ? "SI" : "NO");
            }
        }
    }
}