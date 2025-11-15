package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 7, 542};

        for (int i = 0, j = myArray.length - 1; i < myArray.length / 2; i++, j--) {
            int zwischenspeicher = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = zwischenspeicher;
        }

        //System.out.println(Arrays.toString(myArray));
    }
}
