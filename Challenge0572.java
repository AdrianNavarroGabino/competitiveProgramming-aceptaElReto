// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0572 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int index = 0; index < cases; index++) {
			boolean hay9 = false;
			boolean hay0 = false;
			
			for(int i = 0; i < 5; i++) {
				double nota = sc.nextDouble();
				
				if(nota == 0) {
					hay0 = true;
				}
				else if(nota >= 9) {
					hay9 = true;
					sc.nextLine();
					break;
				}
			}
			
			if(hay9 || !hay0) {
				System.out.println("MEDIA");
			}
			else {
				System.out.println("SUSPENSO DIRECTO");
			}
		}
	}
}