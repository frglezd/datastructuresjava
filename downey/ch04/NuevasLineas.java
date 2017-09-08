import java.util.*;

class NuevasLineas{

    public static void nuevaLinea(){
        System.out.println();
    }

    public static void nLineas(int n){
        if(n > 0){
            System.out.println("");
            nLineas(n-1);
        }
    }

    public static void main(String[] args){
        nLineas(5);
    }

}
