
import java.io.PrintWriter;
import java.util.Scanner;


public class HotestMountain1484 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        double temp=Double.MIN_VALUE;
        int pos=-1;
        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            if(temp<=x){
                temp=x;
                pos=i;
            }
        }
        out.println(pos+1);
        out.close();
    }
}
