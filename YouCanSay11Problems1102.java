import java.util.Scanner;
import java.io.PrintWriter;

public class YouCanSay11Problems1102 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        String s ="";
        int[] a = new int [2];
        while (!s.equals("0")){
            s=sc.next();
            if(s.equals("0"))break;
            for (int i = s.length()-1; i >= 0; i--) {
                a[((s.length()-1)-i)%2] = (a[((s.length()-1)-i)%2] + ( s.charAt(i)-'0'))%11;
            }
            out.print(s);
            if((a[0]-a[1])%11==0){
                out.println(" is a multiple of 11.");
            }else{
                out.println(" is not a multiple of 11.");
            }
        }
        out.close();
    }
    
}
