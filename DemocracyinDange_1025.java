
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DemocracyinDange_1025 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int a = sc.nextInt();
        int mid = (a+1)/2;
        int[] pp = new int[a];
        for (int i = 0; i < a; i++) {
            pp[i]=sc.nextInt();
        }
        Arrays.sort(pp);
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += (pp[i]+2)/2;
        }
        out.println(sum);
        out.close();
    }
}
