import java.util.*;

class Ejercicio7_5{


    private static Scanner scan;
	private static Scanner scan2;
	private static Scanner scan3;
	public static void primera(){
       scan = new Scanner(System.in);
       String s = scan.next();
       char c = s.charAt(0);
       System.out.println(c);
    }

    public static void ultima(){
       scan2 = new Scanner(System.in);
       String s = scan2.next();
       int largo = s.length()-1;
       char c = s.charAt(largo);
       System.out.println(c);
    }

    public static void medio(){
       scan3 = new Scanner(System.in);
       String s = scan3.next();
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
