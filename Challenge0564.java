// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0564 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			
			System.out.println(n / 3);
		}
	}
}