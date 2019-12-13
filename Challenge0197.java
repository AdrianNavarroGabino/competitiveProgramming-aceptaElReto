// Adrián Navarro Gabino

import java.util.*;

public class Challenge0197
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence, aux, firstPart, secondPart, finalAux, finalSentence;
        
        while(sc.hasNext())
        {
            firstPart = "";
            secondPart = "";
            finalSentence = "";
            aux = "";
            sentence = sc.nextLine();
            
            for(int i = 0; i < sentence.length(); i++)
            {
                if(i % 2 == 0)
                {
                    firstPart += sentence.charAt(i);
                }
                else
                {
                    secondPart = sentence.charAt(i) + secondPart;
                }
            }
            
            finalAux = firstPart + secondPart;
            
            for(int i = 0; i < finalAux.length(); i++)
            {
                switch(finalAux.charAt(i))
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
                    case 'U':
                        for(int j = aux.length() - 1; j >= 0; j--)
                        {
                            finalSentence += aux.charAt(j);
                        }
                        finalSentence += finalAux.charAt(i);
                        aux = "";
                        break;
                    default:
                        aux += finalAux.charAt(i);
                        break;
                }
            }
            
            for(int j = aux.length() - 1; j >= 0; j--)
            {
                finalSentence += aux.charAt(j);
            }
            
            System.out.println(sentence + " => " + finalSentence);
        }
    }
}
