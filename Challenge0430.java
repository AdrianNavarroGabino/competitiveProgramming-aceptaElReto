// Adrián Navarro Gabino

import java.util.Scanner;

public class Challenge0430
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        int time, aux;

        while(cases != 0)
        {
            int[][] workouts = new int[cases][];

            for(int i = 0; i < cases; i++)
            {
                workouts[i] = new int[]{sc.nextInt(), sc.nextInt()};
            }

            time = workouts[0][0];

            for(int i = 1; i < cases; i++)
            {
                aux = 0;
                while(time >= workouts[i][0] + workouts[i][1] * aux)
                {
                    aux++;
                }

                time = workouts[i][0] + workouts[i][1] * aux;
            }

            System.out.println(time);

            cases = sc.nextInt();
        }
    }
}