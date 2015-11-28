
import java.io.PrintWriter;
import java.util.Scanner;


public class Div6P1288 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum=0;
            char num[] = sc.next().toCharArray();
            if((num[num.length-1]-'0')%2==0){
                for (int j = 0; j < num.length; j++) {
                    sum+=(num[j]-'0');
                }
                if(sum%3==0){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }else{
                out.println("NO");
            }
            
            
        }
        out.close();
    }
}
