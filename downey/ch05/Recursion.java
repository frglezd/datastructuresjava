

class Recursion{

    public static char primero (String s){
        return s.charAt(0);
    }

    public static String resto (String s) {
       return s.substring(1, s.length());        
    }

    public static int largo (String s){
        return s.length();
    }

    public static void imprimirCadena(String cadena){
        if(largo(cadena) > 0){
            System.out.println(primero(cadena));
            imprimirCadena(resto(cadena));
        }
    }

    public static String invertirCadena(String cadena){
        if(largo(cadena) == 1){
            return cadena;
        } else {
            String inverso = invertirCadena(resto(cadena)) + primero(cadena);
            return inverso; 
        }
    }

    public static void main(String[] args){
        String a = "hola";

        System.out.println("Primer caracter: " + primero(a));
        System.out.println("Resto: " + resto(a));
        imprimirCadena(a);        
        String inverso = invertirCadena("Texto");
        System.out.println(inverso);
    }

}
