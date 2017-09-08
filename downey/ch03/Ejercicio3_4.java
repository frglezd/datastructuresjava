import java.util.*;

class Ejercicio3_4{

    public static void imprimirFecha(String diaSemana, String diaMes, String mes, int año){
        System.out.print(diaSemana + ", ");
        System.out.print(mes + " ");
        System.out.print(diaMes + " ,");
        System.out.println(año);
    }
    
    public static void main(String[] args){
        imprimirFecha("Miércoles", "29", "Septiembre", 2010);
    }
}
