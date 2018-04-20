import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by chris luczkow on 4/15/2018.
 */
public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        if (s.endsWith("PM")) {
            int n;
            if (s.charAt(0) == '0') {
                n = Character.getNumericValue(s.charAt(1)) + 12;
            }
            else {
                if (s.charAt(1) == '1') {
                    n = Integer.parseInt(s.substring(0, 2)) + 12;
                }
                else {
                    n = 12;
                }
            }
            return Integer.toString(n) + s.substring(2, s.length() - 2);
        }
        else {
            if (s.charAt(0) == '1' && s.charAt(1) == '2') {
                return "00" + s.substring(2, s.length() - 2);
            }
            else {
                return s.substring(0, s.length() - 2);
            }
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
