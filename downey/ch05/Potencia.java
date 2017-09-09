import java.util.*;

class Potencia{
    
    public static double potencia(double x, double n){
        if(n == 0){
            return 1;
        }
        return x * potencia(x, n-1);

    }

    public static void main(String[] args){
        System.out.println(potencia(3,0));
        System.out.println(potencia(3,3));
    }
}
