import java.util.*;

class ImprimirParidad{
    
    public static void imprimirParidad(int x){
        if(x%2==0){
            System.out.println("x es par");
        } else {
            System.out.println("x es impar");
        }
    }

    public static void main(String[] args){
        imprimirParidad(17);
    }
}
