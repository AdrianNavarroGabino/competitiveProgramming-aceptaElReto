// Adrián Navarro Gabino

import java.util.*;

public class Challenge0482 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        String input = sc.nextLine();
        boolean g, n;

        while(input.charAt(0) != '.') {
            g = true;
            n = true;

            for(int i = 0; i < input.length() / 2; i++) {
                if(input.charAt(i * 2) == 'N') {
                    n = !n;
                }
                else {
                    g = !g;
                }
            }

            System.out.println(!n ?
                (!g ? "PAREJA MIXTA" : "NEGRO SOLITARIO") :
                    !g ? "GRIS SOLITARIO" : "EMPAREJADOS");

            input = sc.nextLine();
        }
	}
}