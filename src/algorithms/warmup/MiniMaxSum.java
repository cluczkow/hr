package algorithms.warmup;

import java.util.Scanner;

/**
 * Created by chris luczkow on 4/15/2018.
 */
public class MiniMaxSum {

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */
        long min = 0;
        long max = 0;
        int lowest = 0;
        int highest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[lowest]) {
                lowest = i;
            }
            if (arr[i] > arr[highest]) {
                highest = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != highest) {
                min += arr[i];
            }
            if (i != lowest) {
                max += arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
