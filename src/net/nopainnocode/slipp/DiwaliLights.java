package net.nopainnocode.slipp;

import java.util.Scanner;

/**
 * Created by no_pain_no_code on 2016. 4. 25..
 * https://www.hackerrank.com/challenges/diwali-lights
 */
public class DiwaliLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while(T-- > 0){

            int N = scanner.nextInt();
            int res = 1;
            while(N-- > 0){
                res = (res * 2) % 100000;
            }

            System.out.println(res-1);
        }
    }
}
