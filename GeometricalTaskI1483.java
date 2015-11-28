
import java.io.PrintWriter;
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
public class GeometricalTaskI1483 {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) {
        int a,b;
        if(sc.next().equals("square")){
            a=sc.nextInt();
            out.println(a*a);
        }else{
            a=sc.nextInt();
            b=sc.nextInt();
            out.println(a*b);
        }
        out.close();
    }
}
