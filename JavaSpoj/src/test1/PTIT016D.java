package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author hoangtd
 *         18/10/2016
 */
public class PTIT016D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(gt(a, n, k));

    }

    public static long gt(long a[], int n, int k) {
        // trả về một mảng sau khi đã sắp xếp
        System.out.println(n);
        System.out.println(k);
        Arrays.sort(a);
        long tong = a[0];
        int dauTru = n - k - 1;
        for (int i = 1; i < dauTru + 1; i++) {
            tong -= a[i];
        }
        for (int j = dauTru +1; j < n; j++) {
            tong += a[j];
        }
        return tong;
    }
}
