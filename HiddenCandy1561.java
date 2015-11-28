
import java.io.PrintWriter;
import java.util.Scanner;





public class HiddenCandy1561 {
    int[] tree =new int[3000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
    }
    
    static void buildTree(int low,int high,int pos){
        // Condicion de paro de la recursividad 
        if(low==high){
            // si el arreglo a insertar es solo un numero se agrega en la posicion correspondiente 
            // Un solo numero tiene el val de 2 y su primer y ultimo numero son el mismo
            tree[pos] = ;
            return;
        }
        // calculamos la mitad para dividir el arreglo
        int mid = (low+high)/2;
        //Construimos las mitades
        // Ya que nuestro arbol es binario esta representado en un arreglo 
        // Donde los hijos de las pos p son 2*p+1 y 2*p+2
        buildTree(low, mid,2*pos+1);
        buildTree(mid+1,high,2*pos+2);
        //unimos las mitades 
        tree[pos] = check(tree[2*pos+1],tree[2*pos+2]);
    }
}
