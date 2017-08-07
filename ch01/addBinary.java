import java.io.*;

class addBinary{

   public static void main(String[] args){

      int[] a;
      int[] b;
      int n = a.length;
      int c[] = a[n+1];
      int carry = 0;

      for (int i= 1; i < n; i++){
   
         c[i] = (a[i] + b[i] + carry)%2;
         carry = (a[i] + b[i] + carry)/2;      
      }

      c[n+1] = carry;

      System.out.println(c);

   }

}
