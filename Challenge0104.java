// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0104 {
    static Scanner sc = new Scanner(System.in);

    public static long solveMobile() {
        long pi, di, pj, dj, ti, tj;

        pi = sc.nextLong();
        di = sc.nextLong();
        pj = sc.nextLong();
        dj = sc.nextLong();

        if(pi == 0 && di == 0 && pj == 0 && dj == 0) {
            return 0;
        }
        if(pi == 0) {
            pi = solveMobile();
        }
        if(pj == 0) {
            pj = solveMobile();
        }

        ti = di * pi;
        tj = dj * pj;

        if(ti < 0 || tj < 0) {
            return -1;
        }

        if(ti == tj) {
            return pi + pj;
        }
        return -1;
    }

    public static void main(String[] args) {
        long result = solveMobile();

        while(result != 0) {
            if(result < 0) {
                System.out.println("NO");
            }
            else {
                System.out.println("SI");
            }

            result = solveMobile();
        }
    }
}