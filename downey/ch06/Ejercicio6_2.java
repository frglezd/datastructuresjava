

class Ejercicio6_2{
    
    public static void main(String[] args){
        metodo("((3+7)*2))))");
    }

    public static void metodo(String s){
//        s = "((3+7)*2)";
        int largo = s.length();

        int i = 0;
        int cont = 0;

        while(i < largo){
            char c = s.charAt(i);
            
            if(c == '('){
                cont = cont + 1;
            } else if(c == ')'){
                cont = cont -1;
            }
            i++;
        }
        System.out.println(cont);        
    }
}
