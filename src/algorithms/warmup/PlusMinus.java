package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by chris luczkow on 4/15/2018.
 */
public class PlusMinus {
    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
        int p = 0;
        int n = 0;
        int z = 0;
        for (int i : arr) {
            if (i > 0) {
                p++;
            }
            else if (i < 0) {
                n++;
            }
            else {
                z++;
            }
        }
        System.out.println((float)p / (float)arr.length);
        System.out.println((float)n / (float)arr.length);
        System.out.println((float)z / (float)arr.length);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
