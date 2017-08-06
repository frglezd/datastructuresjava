import java.util.*;

public class suma{

   public static void main(String[] args){
   
   double suma = 1.0;

   for (int i= 1; i < 10000; i++){

      suma = suma + 0.00001;
   }

   System.out.println(suma);
   }
}
