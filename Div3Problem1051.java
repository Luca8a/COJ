import java.util.Scanner;
import java.io.PrintWriter;
/*
1  0                 1%3 = 1   1/3 = 0
12 1                 2%3 = 2   2/3 = 0
123 2                3%3 = 0   3/3 = 1 
1234 2               4%3 = 1   4/3 = 1
12345 3              5%3 = 2   5/3 = 1
123456 4
1234567 4
12345678 5
123456789 6
12345678910 6       10%3 = 1 10/3 = 3   
*/
public class Div3Problem1051 {


    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int n,a=0;
        
        n = sc.nextInt();
        if(n%3==2){
            out.println(((n/3)*2) + 1);
        }else{
            out.println((n/3)*2);
        }
        
        out.close();
    }
}


