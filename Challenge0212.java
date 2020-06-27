// Adrián Navarro Gabino

import java.util.*;

public class Challenge0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertices = sc.nextInt();
        int points;
        int[] data;
        int isPossible;

        while(vertices != 0) {
            isPossible = 0;
            points = sc.nextInt();
            data = new int[points];
            Arrays.fill(data, 0);

            for(int i = 0; i < vertices; i++) {
                data[sc.nextInt() - 1]++;
                data[sc.nextInt() - 1]++;
            }

            for(int i = 0; i < points; i++) {
                if(data[i] % 2 != 0) {
                    isPossible++;
                }
            }

            System.out.println(isPossible > 2 ? "NO" : "SI");

            vertices = sc.nextInt();
        }
    }
}