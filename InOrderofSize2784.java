
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class InOrderofSize2784 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b[] = new int [a];
        for (int i = 0; i < a; i++) {
            b[i]= sc.nextInt();
        }
        Arrays.sort(b);
        if(a==1){
            out.println(b[0]);
            out.close();
            return;
        }
        out.print(b[a-1]+" ");
        for (int i = 0; i < a-2; i++) {
            out.print(b[i]+" ");
        }
        out.println(b[a-2]);
        out.close();
    }
}
