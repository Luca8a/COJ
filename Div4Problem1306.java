import java.util.Scanner;
import java.io.PrintWriter;

public class Div4Problem1306 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n,a;
        String s;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            s = sc.next();
            if(s.length()>2){
                a = Integer.parseInt(s.charAt(s.length()-2)+""+s.charAt(s.length()-1));
            }else{
                a = Integer.parseInt(s);
            }
            if(a%4==0){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.close();
    }
}
