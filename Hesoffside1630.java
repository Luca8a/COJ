
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luck
 */
public class Hesoffside1630 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) {
        int a, b;
        
        
        while(sc.hasNext()){
            
            a = sc.nextInt();
            b = sc.nextInt();
            int o[]= new int[a];
            int d[] = new int[b];
            if(a==b && a==0) break;
            for (int i = 0; i < a; i++) {
                o[i]=sc.nextInt();
            }
            for (int i = 0; i < b; i++) {
                d[i]=sc.nextInt();
            }
            Arrays.sort(o);
            Arrays.sort(d);
            if(o[0]<d[1]){
                out.println("Y");
            }else{
                out.println("N");
            }           
        }
        out.close();
    }
}
