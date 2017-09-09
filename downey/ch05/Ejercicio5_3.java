import java.util.*;

class Ejercicio5_3{
    
    public static void main(String[] args){
        boolean bandera1 = esRaro(202);
        boolean bandera2 = esBorroso(202);
        System.out.println(bandera1);
        System.out.println(bandera2);
        if(bandera1 && bandera2) {
            System.out.println("ping!");
        } if (bandera1 || bandera2) {
            System.out.println("pong!");
        }
    }

    public static boolean esRaro (int x) {
        boolean banderaRaro;
        if(x%2 ==0){
            banderaRaro = true;
        } else {
            banderaRaro = false;
        }
        return banderaRaro;
    }

    public static boolean esBorroso(int x){
        boolean banderaBorroso;
        if(x > 0){
            banderaBorroso = true;
        } else {
            banderaBorroso = false;
        }
        return banderaBorroso;
    }


}
