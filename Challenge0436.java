// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0436 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paperWeight;
        double height;
        
        while(sc.hasNext()) {
            paperWeight = sc.nextInt();
            height = sc.nextLong() * 1000000.0 / paperWeight;

            System.out.println((int)Math.ceil(Math.log(height) / Math.log(2)));
        }
	}
}