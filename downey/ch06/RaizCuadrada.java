import java.util.*;

class RaizCuadrada{

    private static Scanner sc;

	public static double raizCuadrada(double x){
        
        double temp, a;
        sc = new Scanner(System.in);
        System.out.print("Ingrese un valor inicial:");
        double xi = sc.nextDouble();
       
        while(true){
        temp = xi;
        a = (xi + x/xi); 
        xi = a/2;
            if(Math.abs(xi-temp) < 0.0001){
                System.out.println("Raiz cuadrada por aproximación: " + xi);
                return 0;
            }
        }

    }

    public static void main(String[] args){

        raizCuadrada(9);
        System.out.println("Raiz cuadrada por Math.sqrt: " + Math.sqrt(9));

    }
}
