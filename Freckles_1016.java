
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Nodo{
        double x;
        double y; 
        public Nodo(double x, double y){
            this.x=x;
            this.y=y;
        }
        
        public double Dist(Nodo b){
            return Math.sqrt((Math.pow(this.x-b.x, 2))+(Math.pow(this.y-b.y, 2)));
        }
    }
class Edge implements Comparable<Edge>{
        int u;
        int v;
        double w;
        
        public Edge(int u, int v,double w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(Edge o) {
            return Double.compare(this.w, o.w);
        }    

    @Override
    public String toString() {
        return "Edge{" + "u=" + u + ", v=" + v + ", w=" + w + '}';
    }
        
    }
public class Freckles_1016 {

    static int dsu[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int vis[]= new int[n];
        Nodo d[]=new Nodo[n];
        ArrayList<Edge> ae= new ArrayList<Edge>();
        dsu= new int[n];
        
        for (int i = 0; i < n; i++) {
            double a,b;
            a= sc.nextDouble();
            b= sc.nextDouble();
            d[i]=new Nodo(a, b);    
            dsu[i]=i;
        }
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n; j++) {
                ae.add(new Edge(i, j, d[i].Dist(d[j])));
            }
        }
        Edge e[]= new Edge[ae.size()];
        ae.toArray(e);
        
       Arrays.sort(e);
       double res=0 ;
        for (int i = 0; i < e.length; i++) {
            if(!isSameSet(e[i].u,e[i].v)){
                union(e[i].u,e[i].v);
                res+=e[i].w;
            }
        }
        
        
        
        out.printf("%.2f\n",res);
        out.close();
    }
    public static boolean isSameSet(int i, int j){
        return get(i)==get(j);
    }
    
    public static int get(int i) {
        if(dsu[i]==i){
            return i;
        }
        dsu[i]=get(dsu[i]);
        return dsu[i];
    }
    
    public static void union(int i, int j){
        dsu[j]=i;
    }
}
