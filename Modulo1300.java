
import java.io.PrintWriter;
import java.util.Scanner;

public class Modulo1300 {
    static Scanner sc = new Scanner (System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int dif[] = new int[42];

        for (int i = 0; i < 10; i++) {
            dif[sc.nextInt()%42]=1;
        }
        int res=0;
        for (int i = 0; i < 42; i++) {
            res+=dif[i];
        }
        out.println(res);
        out.close();
    }
    
}
