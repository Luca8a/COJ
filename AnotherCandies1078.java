
import java.io.PrintWriter;
import java.util.Scanner;


public class AnotherCandies1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n,a ;
        int sum;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum=0;
            a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                sum=(sum%a+(int)(sc.nextLong()%a))%a;
            }
            if(sum%a==0){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        out.close();
    }
    
}
