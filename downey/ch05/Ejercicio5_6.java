import java.util.*;

public class Ejercicio5_6{
    public static void main(String[] args){
        System.out.println(prod(1,4));
        System.out.println(factorial(10));
    }

    public static int prod(int m, int n){
        if(m == n){
            return n;
        } else {
            int recursion = prod(m, n-1);
            int resultado = n * recursion;
            return resultado;
        }
    }

    public static int factorial(int n){
        if(n == 0 || n == 1) {
        return 1;
        } else {
            return n *= factorial(n-1);
        }
    }
}
