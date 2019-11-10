// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0475 {
    
    public static void main(String[] args) {
        int count, order;
        
        Scanner sc = new Scanner(System.in);
        
        int casos = sc.nextInt();
        sc.nextLine();
        String nombre = "stanlee";
        
        for (int i = 0; i < casos; i++) {
            String frase = sc.nextLine();
            
            frase = frase.toLowerCase();
            count = 0;
            order = 0;
            
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == nombre.charAt(order))
                    order++;
                
                if (order == 7) {
                    order = 0;
                    count++;
                }
            }
            System.out.println(count);
        }
    } 
}
