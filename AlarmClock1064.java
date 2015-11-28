
import java.io.PrintWriter;
import java.util.Scanner;


public class AlarmClock1064 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int h1=-1,m1=-1,h2=-1,m2=-1;
        while(h1+m1+h2+m2!=0){
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();
            int hr=0,mr=0;
            if(h1>h2){
                h2+=24;               
            }
    
            hr=h2-h1;
            //System.out.println(h1+" "+h2+" "+hr);
            if(m1>m2){
                if(h1==h2){
                    hr=24;
                }
                m2+=60;

                hr-=1;
            }
                mr+=m2-m1;
                mr =hr*60+mr;
                if(mr!=0){
                    out.println(mr);
                }
        }
        out.close();
    }
}
