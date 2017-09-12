

class TablaMultiplicacion{

    public static void imprimirMultiplos(int n){
        int i = 1;
        while (i <= 6){
            System.out.print(n*i + " ");
            i = i +1;
        }
        System.out.println("");

    }

    public static void imprimirTablaMultiplos(int largo){
        int i = 1;
        while(i <= largo){
            imprimirMultiplos(i,i) ;
            i++;
        }
    }


    public static void imprimirMultiplos(int n, int largo){
        int i = 1;
        while (i <= largo){
            System.out.print(n*i + " ");
            i = i +1;
        }
        System.out.println("");

    }

    public static void main(String[] args){
        
        imprimirTablaMultiplos(7);
            
    }


}
