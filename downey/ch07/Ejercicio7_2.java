

class Ejercicio7_2{

    public static String bing(String s){
        int i = s.length()-1;
        String total = "";

        while(i >= 0){
            char ch = s.charAt(i);
            System.out.println(i + "   " + ch);
            
            total = total + ch;
            i--;            
        }
        return total;
    }

    public static void main(String[] args){
        System.out.println(bing("Allen"));
    }

}
