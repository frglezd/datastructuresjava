import java.util.*;

class Suma{

    public static int metUno(int m, int n){
        if (m == n){
            return n;
        }  else {
            return m + metUno(m+1,n);
        }
    }

    public static int metDos(int m, int n){
        if (m == n){                       
            return n;
        }  else {
            return n * metUno(m,n-1);
        }
    }

    public static void main(String[] args){
        System.out.println(metUno(1, 10));
        System.out.println(metDos(1, 10));
    }
}
