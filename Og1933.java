
import java.io.PrintWriter;
import java.util.Scanner;


public class Og1933 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int s=-1,d=-1;
        while(s+d!=0){
            s = sc.nextInt();
            d = sc.nextInt();
            if(s+d!=0){
                out.println(s+d);
            }
        }
        out.close();
    }
}
