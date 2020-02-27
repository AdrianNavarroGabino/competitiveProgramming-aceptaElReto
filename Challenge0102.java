// Adrián Navarro Gabino

import java.util.*;

public class Challenge0102
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String sentenceAux, sentence;
        int vowels, step;
        final int stepAux = 'z' - 'a' + 1;

        while(true)
        {
            sentence = sc.nextLine();
            step = sentence.charAt(0) - 'p';
            while(Math.abs(step) >= stepAux)
            {
                step = (step < 0) ? step + stepAux : step - stepAux;
            }
            vowels = 0;
            sentenceAux = "";

            for(int i = 1; i < sentence.length(); i++)
            {
                if(sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')
                {
                    sentenceAux += (char)(sentence.charAt(i) - step);

                    if(sentenceAux.charAt(i - 1) < 'A')
                    {
                        sentenceAux = sentenceAux.substring(0, i - 1) + 
                            (char)(sentenceAux.charAt(i - 1) + stepAux);
                    }
                    else if(sentenceAux.charAt(i - 1) > 'Z')
                    {
                        sentenceAux = sentenceAux.substring(0, i - 1) + 
                            (char)(sentenceAux.charAt(i - 1) - stepAux);
                    }
                }
                else if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z')
                {
                    sentenceAux += (char)(sentence.charAt(i) - step);

                    if(sentenceAux.charAt(i - 1) < 'a')
                    {
                        sentenceAux = sentenceAux.substring(0, i - 1) + 
                            (char)(sentenceAux.charAt(i - 1) + stepAux);
                    }
                    else if(sentenceAux.charAt(i - 1) > 'z')
                    {
                        sentenceAux = sentenceAux.substring(0, i - 1) + 
                            (char)(sentenceAux.charAt(i - 1) - stepAux);
                    }
                }
                else
                {
                    sentenceAux += " ";
                }

                switch(sentenceAux.charAt(i - 1))
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': vowels++; break;
                }
            }

            if(sentenceAux.equals("FIN"))
            {
                break;
            }

            System.out.println(vowels);
        }
    }
}