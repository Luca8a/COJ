
import java.io.PrintWriter;
import java.util.Scanner;


public class Coprimes1050 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int cont=0;
        for (int i = 1; i <= n; i++) {
            if(coprimos(i,n)){
               // System.out.println(i+" "+n);
                cont++;
            }
        }
        out.println(cont);
        out.close();
    }
    static boolean coprimos(int i, int n){
         if(i%n==1){
        return true;
        }
        if(i%n==0){
        return false;
        }
        return coprimos(n,i%n);
    }
}
