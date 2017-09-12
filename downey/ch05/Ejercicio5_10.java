

class Ejercicio5_10{

    public static double potencia(double x, double n){
        if(n == 0){
            return 1.0;
        }
        else if (n > 0){
            return x * potencia(x, n-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(potencia(2,3));

    }

}
