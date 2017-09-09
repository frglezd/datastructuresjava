import java.util.*;

public class Ejercicio5_7{
    public static void main(String[] args){
        System.out.println(ackermann(5,5));
    }

    public static int ackermann(int m, int n){
        int resultado = 0;
        if(m ==0){
            resultado = n+1;
        } else if(m>0 && n==0) {
            resultado = ackermann(m-1,1);
        } else if (m>0 && n >0){
            resultado = ackermann(m-1, ackermann(m,n-1));
        }
        return resultado;
    }
}
