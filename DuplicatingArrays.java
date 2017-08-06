public class DuplicatingArrays{
   public static void main(String[] args){

      int[]a = {22, 44, 66, 88};
      print(a);
   }

   public static void print(int[] a){
      System.out.printf("{%d", a[0]);
         for(int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
         }
         System.out.println("}");
   }
