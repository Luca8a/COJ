
import java.io.PrintWriter;
import java.util.Scanner;



public class NumericParity1059 {
    public static void main(String[] args) {
        int n=-1;
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n=sc.nextInt();
        while(n!=0){
            out.println("The parity of "+Integer.toBinaryString(n)+ " is "+Integer.bitCount(n)+" (mod 2).");
            n=sc.nextInt();
        }
        out.close();
    }
}
