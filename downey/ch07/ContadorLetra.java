import java.util.*;

class ContadorLetra{

    
    
    public static void contarLetras(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese palabra:");
        String palabra = sc.nextLine();
        System.out.print("Ingrese letra a buscar:");
        char letra = sc.next().charAt(0);
        int largo = palabra.length();
        int contador = 0;

        for(int i = 0; i < largo; i++){
            if(palabra.charAt(i) == letra){
                contador++;
            }
        }
        System.out.println(contador);
    }

    public static void main(String[] args){
        contarLetras();
    }

}
