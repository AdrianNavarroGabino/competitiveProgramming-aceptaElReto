// Adrián Navarro Gabino

import java.util.*;

public class Challenge0533
{
    public static void main(String[] args)
    {
        boolean found;
        int kg;
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++){
            found = false;
            kg = sc.nextInt() * 1000;
            sc.nextLine();
            
            List<String> bottles = Arrays.asList(sc.nextLine().split(" "));
            for (int j = 0 ; j < bottles.size() - 1 ; j++){
                kg -= Integer.parseInt(bottles.get(j)) * 125;
                if(kg <= 0)
                {
                    found = true;
                    System.out.println(j + 1);
                    break;
                }
            }
            if(!found){
                System.out.println("SIGAMOS RECICLANDO");
            }

        }
    }
}
