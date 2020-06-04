// Adrián Navarro Gabino

import java.util.*;

public class Challenge0571 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int cases = sc.nextInt();
			sc.nextLine();
			
			String[] keys = new String[cases];
			int[] values = new int[cases];
			
			int max = 0;
			
			
			for(int i = 0; i < cases; i++) {
				String data = sc.nextLine();
				
				keys[i] = data.split(" ")[0];
				values[i] = Integer.parseInt(data.split(" ")[1]);
				
				if(values[i] >= max) {
					max = values[i];
					System.out.println("NO HAY");
				}
				else {
					for(int j = i - 1; j >= 0; j--) {
						if(values[i] < values[j]) { 
							System.out.println(keys[j]);
							break;
						}
					}
				}
			}
			System.out.println("---");
		}
	}
}