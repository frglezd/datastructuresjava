import java.util.*;

public class numbers{

   public static void main(String[] args){

      List<Integer> numbers = new ArrayList<Integer>();

      // store 10 integer values in list numbers
      for (int k = 0; k < 10; k++) {
      numbers.add(k); // short for numbers.add(new Integer(k));
      }

      // get the values back and put them in an array
/*      int[] array = new int[10];
      for (int k = 0; k < 10; k++) {
        array[k] = numbers.get(k); // short for array[k] = numbers.get(k).intValue();
      }
*/
      System.out.println(numbers.size());

      for (int pos = 0; pos < 2 * numbers.size(); pos += 2) {
               numbers.add(pos, numbers.get(pos));
           }      

   }
}
