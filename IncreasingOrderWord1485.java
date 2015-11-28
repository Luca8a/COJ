


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class IncreasingOrderWord1485 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        String s = sc.next();
        char[] ss= s.toCharArray();
        Arrays.sort(ss);
        for (int i = 0; i < ss.length; i++) {
            out.print(ss[i]);
        }
        out.println();
        out.close();
    }
}
