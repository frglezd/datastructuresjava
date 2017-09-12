import java.util.*;

class ContadorLetra{

    
    
    private static Scanner scanner;

	public static void contarLetras(){
        System.out.print("Ingrese palabra:");
        scanner = new Scanner(System.in);
		String palabra = scanner.nextLine();
        System.out.print("Ingrese letra a buscar:");
        char letra = scanner.next().charAt(0);
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
