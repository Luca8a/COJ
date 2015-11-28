
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class BeautyContest2145 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int a = sc.nextInt();
        int[][] b = new int[a][10];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j]=sc.nextInt();
            }
            Arrays.sort(b[i]);
        }
        int sum =0;
        for (int i = 0; i < a; i++) {
            sum=0;
            for (int j = 1; j < 9; j++) {
                sum += b[i][j];
            }
            out.printf("%d %d\n",i+1,sum);
        }
        
        out.close();
        
    }
    
}
