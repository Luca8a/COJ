

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Luis Carlos Ochoa 
 */
public class AliceandArrayinFlames3283 {
    
    //Clase que representa el nodo en el arbol 
    public static class Nodo{
        int val; // 0, 1, 2 dependiendo si la cadena abajo de el es incresing non decrising o ninguna 
        int lastN; // ultimo numero de la cadena
        int firstN; // primer numero de la cadena 
        //Sirven para saber el valor que hay que ponerle al padre
        
        Nodo(int val, int firstN, int lastN){
            this.val = val;
            this.lastN = lastN;
            this.firstN = firstN;
        }

        @Override
        public String toString() {
            return val+"";
        }
        
        
    }
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static int arr[] = new int[100010];
    static Nodo tree[] = new Nodo[300000];
    
    
    public static void main(String[] args) {
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            arr[i]= sc.nextInt();
        }
        /* Armamos el arbol con la cadena inicial 
        *  Al ser recursivo el metodo debemos enviar la pos inicial, final , pos a insertar
        *  La primer interacion es con todo el arreglo por lo tanto es 0 a arr.lengh-1 = a-1, en la pos 0        
        */
        buildTree(0, a-1,0);
        int c,d,e;
        for (int i = 0; i < b; i++) {
            //Leemos las instrucciones y queries 
            //System.out.println(Arrays.toString(tree));
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            
            if(c==1){
                //normalizamos parametros por lo cual la pos d = d-1 
                // updareTree recibe la pos del arreglo donde actualizara, 
                //              valor a actualizar, inicio del arreglo, fin , y pos a insertar en el arbol 
                updateTree(d-1,e,0,a-1,0);
            }
            if(c==2){
                //normalizamos parametros por lo cual la pos d = d-1  y e = e-1
                // queryTree recibe low y high del rango a consultar, 
                //               inicio del arreglo, fin , y pos a insertar en el arbol 
                System.out.println(queryTree(d-1,e-1,0,a-1,0).val);
            }
        }
        
    }

    // low y high se hacen referncia al rango que abarcan en el arreglo 
    // pos es la posicion en la que estamos en el arbol 
    static Nodo updateTree(int upos, int uval,int low, int high, int pos){
        //Condicion de paro 
        // Si la pos a insertar es igual que low y high 
        if(upos == low && upos == high){
            tree[pos].firstN = uval;
            tree[pos].lastN = uval;
            return tree[pos];
        }
        int mid= (low+high)/2;
        if(upos >= low && upos <= high){ 
            // si la pos a actualizar esta en el rango;
            // checar ambos hijos del nodo 
            tree[pos]= check(updateTree(upos, uval, low, mid, 2*pos+1),
                    updateTree(upos, uval, mid+1, high, 2*pos+2));
        }
        // si la pos a actualizar esta fuera del rango;
        return tree[pos];
    }
    
    // low y high se hacen referncia al rango que abarcan en el arreglo 
    // pos es la posicion en la que estamos en el arbol
    static Nodo queryTree(int qlow, int qhigh, int low , int high, int pos){
        // Si el rango a consultar abarca el rango del arbol regresa el valor de ese nodo
        if(qlow<=low && qhigh>= high){
            return tree[pos];
        }
        
        // si el rango del arbol esta completamente fura del de consulta regresa null
        if(qlow>high || qhigh < low){//No Overlap
            return null;
        }
        //Si la consulta abarca parte del rango hay que checar ambos lados. 
        int mid = (low+high)/2;
        return check(queryTree(qlow,qhigh,low,mid,2*pos+1),
                queryTree(qlow, qhigh, mid+1, high, 2*pos+2));
    }
    
        // low y high se hacen referncia al rango que abarcan en el arreglo 
    // pos es la posicion en la que estamos en el arbol
    static void buildTree(int low,int high,int pos){
        // Condicion de paro de la recursividad 
        if(low==high){
            // si el arreglo a insertar es solo un numero se agrega en la posicion correspondiente 
            // Un solo numero tiene el val de 2 y su primer y ultimo numero son el mismo
            tree[pos] = new Nodo(2, arr[low], arr[low]);
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
    static Nodo check(Nodo a, Nodo b){
        if(a == null && b == null){
            return null;
        }
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        //en caso que el Nodo que queremos crear tenga dos hijos
        // Si el valor min de los 2 es:
        // 0 : entonces sin importar lo que agreguemos seguira siendo 0
        // 1 : entonces tenemos que checar que al agregar la nueva cadena se sigan respetando las condiciones para que sea 1
        // 2 : entonces tenemos que checar que al agregar la nueva cadena se sigan respetando las condiciones para que sea 2
        switch(Math.min(a.val, b.val)){
            case 0:
                return new Nodo(0, a.firstN, b.lastN);
            case 1: 
                if(a.lastN<=b.firstN){
                    return new Nodo(1, a.firstN, b.lastN);
                }
                return new Nodo(0, a.firstN, b.lastN);
            case 2:
                if(a.lastN<b.firstN){
                    return new Nodo(2, a.firstN, b.lastN);
                }
                if(a.lastN<=b.firstN){
                    return new Nodo(1, a.firstN, b.lastN);
                }
                return new Nodo(0, a.firstN, b.lastN);
        }
        // No deberia llegar aqui.
        return new Nodo(0, a.firstN, b.lastN);
    }
    
}
