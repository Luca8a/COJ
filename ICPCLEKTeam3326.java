import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ICPCLEKTeam3326 {


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out, true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int n = Integer.valueOf(br.readLine());
        for (int i = 0; i < n; i++) {
            String line[] = br.readLine().split(" ");
            int cant = Integer.valueOf(line[0]);
            
            for (int j = 1; j < cant; j++) {
                int MAX = Lexico_MAX(line, line[j], j);
                boolean MIN = Lexico_MIN(line, line[j], j, MAX);
                if (MAX != -1 && !MIN) {
                    pw.print(MAX + " ");
                } else {
                    pw.print("-1 ");
                }
            }

            pw.println(-1);
        }
        pw.flush();
    }

    public static int Lexico_MAX(String[] arr, String p, int pos) {
        int k = -1;
        for (int i = pos + 1; i < arr.length; i++) {
            if (arr[i].compareTo(p) > 0) {
                k = i;
                break;
            }
        }
        return k;
    }

    public static boolean Lexico_MIN(String[] arr, String p, int posi, int posj) {
        for (int i = posi + 1; i <= posj; i++) {
            if (arr[i].compareTo(p) < 0) {
                return true;
            }
        }
        return false;
    }
}


