// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0306 {
    public static final int MOD = 46337;

    public static long[][] fib(long num) {
        if(num == 1) {
            long[][] result = {{0, 1}, {1, 1}};
            return result;
        }
        if(num == 2) {
            long[][] result = {{1, 1}, {1, 2}};
            return result;
        }

        long[][] half = fib(num / 2);
        if(num % 2 == 0) {
            return multiply(half, half);
        }
        long[][] one = {{0, 1}, {1, 1}};
        return multiply(half, multiply(half, one));
    }

    public static long[][] multiply(long[][] m, long[][] n) {
        long[][] result = {{(m[0][0] * n[0][0] + m[0][1] * n[1][0]) % MOD,
            (m[0][0] * n[0][1] + m[0][1] * n[1][1]) % MOD},
            {(m[1][0] * n[0][0] + m[1][1] * n[1][0]) % MOD,
            (m[1][0] * n[0][1] + m[1][1] * n[1][1]) % MOD}};
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long index = sc.nextLong();

        while(index != 0) {
            System.out.println(fib(index)[0][1]);

            index = sc.nextLong();
        }
    }
}