import java.util.*;

class Recorrido{
    public static int recorrido(){
        String fruta = "banana";
        for (int indice=0; indice < fruta.length(); indice++){
            char letra = fruta.charAt(indice);
            System.out.println(letra);
        }
            return 0;
    }

    public static void main(String[] args){
        recorrido();
    }
}
