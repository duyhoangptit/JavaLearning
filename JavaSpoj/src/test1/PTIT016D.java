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

        System.out.println(sort(inp, n, k));
    }

    public static int sort(String s, int n, int k) {
        String inp[] = s.split(" ");
        for (int i = 0; i < n - 1; i++) {
            for (int m = i + 1; m < n; m++) {
                if (Integer.parseInt(inp[i]) < Integer.parseInt(inp[m])) {
                    String tmp = inp[i];
                    inp[i] = inp[m];
                    inp[m] = tmp;
                }
            }
        }
        int tong = 0;
        for (int i = 0; i < k + 1; i++) {
            tong += Integer.parseInt(inp[i]);
        }
        for (int j = k + 1; j < n; j++) {
            tong -= Integer.parseInt(inp[j]);
        }
        return tong;
    }
}
