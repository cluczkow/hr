import java.util.Scanner;

/**
 * Created by chris luczkow on 4/15/2018.
 */
public class Staircase {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
        String[] strings = new String[n];
        for (int row = 0; row < n; row++) {
            strings[row] = "";
            for (int col = 0; col < n; col++) {
                strings[row] += row + col < n - 1 ? " " : "#";
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
