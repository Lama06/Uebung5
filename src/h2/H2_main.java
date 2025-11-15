package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;
        int digits = 0;
        int[] a = new int[9];

        int n2 = n;
        for (int i = 0; i < 9; i++) {
            a[8 - i] = n2 % 10;
            n2 /= 10;
            if (n2 == 0) {
                digits = i + 1;
                break;
            }
        }

//        System.out.println(digits);
//        System.out.println(Arrays.toString(a));
    }
}
