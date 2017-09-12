
class Ejercicio6_4{

    public static double potenciaIter(double x, double n){

        double resultado = 1;    
            if(n == 0){
                return 1.0;
            } else if(n > 0){

            for (double i = n; i > 0; i--){
                  resultado *= x;
            }
            } else {
                return 0;
            }
            
            return resultado;
    }
    public static double potenciaRec(double x, double n){
        if(n == 0){
            return 1.0;
        }
        else if (n > 0){
            return x * potenciaRec(x, n-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(potenciaIter(2,3));

    }

}
