import java.util.*;

class Ejercicio7_5{


    public static void primera(){
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       char c = s.charAt(0);
       System.out.println(c);
    }

    public static void ultima(){
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       int largo = s.length()-1;
       char c = s.charAt(largo);
       System.out.println(c);
    }

    public static void medio(){
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       int ultimo = s.length()-1;        
       String medio = s.substring(1,ultimo);
       System.out.println(medio);
    }
    public static void main(String[] args){
        primera();
        ultima();
        medio();
    }


}
