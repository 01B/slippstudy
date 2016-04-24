package net.nopainnocode.slipp;

import java.util.Scanner;

/**
 * Created by no_pain_no_code on 2016. 4. 20..
 * https://www.hackerrank.com/challenges/coin-change
 */
public class CoinChange {

    static int recursiveCnt;
    static int N, M, cases;
    static int[] C;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        C = new int[M];

        for (int i = 0; i < M; i++) {
            C[i] = scanner.nextInt();
        }

        System.out.println(dynamic());

        //System.out.println(String.format("count is %d and call count is %d", recursive(N, C, M - 1), recursiveCnt));
    }

    public static int dynamic() {
        int[][] count = new int[M + 1][N + 1];
        for (int m = 0; m <= M; m++) {
            for (int n = 0; n <= N; n++) {
                if (m == 0) {
                    count[m][n] = 0;
                    continue;
                }

                if (n == 0) {
                    count[m][n] = 1;
                    continue;
                }

                if (C[m - 1] > n)
                    count[m][n] = count[m - 1][n];
                else
                    count[m][n] = count[m - 1][n] + count[m][n - C[m - 1]];
            }
        }

        return count[M][N];
    }

    public static int recursive(int N, int[] C, int index) {

        recursiveCnt++;

        if (N < 0)
            return 0;

        if (N == 0)
            return 1;

        if (index < 0)
            return 0;

        return recursive(N, C, index - 1) + recursive(N - C[index], C, index);
    }
}



