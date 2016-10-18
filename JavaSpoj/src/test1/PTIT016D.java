package test1;

import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class PTIT016D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str[] = input.nextLine().split(" ");
        String inp = input.nextLine();
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);


    }

    public static int gt(String s, int k, int n) {
        String inp[] = s.split(" ");
        int tong = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int m = i + 1; m < n; m++) {
                for (int j = 0; j < k; j++) {
                    tong = tong + Integer.parseInt(inp[i]);
                }
            }
        }
    }
}
