import java.util.Scanner;
import java.io.PrintWriter;

public class TraversingGrid1004 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n,a,b;
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a<=b){
                if(a%2==0){
                    out.println("L");
                }else{
                    out.println("R");
                }
            }else{
                if(b%2==0){
                    out.println("U");
                }else{
                    out.println("D");
                }
            }
        }
        out.close();
    }
}
