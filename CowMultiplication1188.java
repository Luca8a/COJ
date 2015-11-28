
import java.io.PrintWriter;
import java.util.Scanner;


public class CowMultiplication1188 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        String a,b;
        a = sc.next();
        b = sc.next();
        long res=0;
        if(a.length()>b.length()){
            long sum=0;
            for (int i = 0; i < a.length(); i++) {
                sum+=Integer.parseInt(a.charAt(i)+"");
            }
            res=0;
            for (int i = 0; i < b.length(); i++) {
                res+=Integer.parseInt(b.charAt(i)+"")*sum;
            }
        }else{
            long sum=0;
            for (int i = 0; i < b.length(); i++) {
                sum+=Integer.parseInt(b.charAt(i)+"");
            }
            res=0;
            for (int i = 0; i < a.length(); i++) {
                res+=Integer.parseInt(a.charAt(i)+"")*sum;
            }
        }
        out.println(res);
        out.close();
    }
}
