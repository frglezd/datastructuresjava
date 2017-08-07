import java.util.*;

class insert{

public static void main(String[] args){

   int[] array= {5,2,4,6,1,3};
   int key, i, j;

   for(j = 1; j < array.length; j++){
      key = array[j];

      i = j-1;   
      while(i >= 0 && array[i] > key) {
   
         array[i+1] = array[i];
         i--;
      
      }
         array[i+1] = key;

   }

   for(int k= 0; k < array.length; k++){
   
   
   System.out.println(array[k]);
   
   }

}
}
