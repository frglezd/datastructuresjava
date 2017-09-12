

class ValorAbsoluto{

    public static double valorAbsoluto(double x){
        if(x < 0){
            return -x;
        } else {
            return x;
        }
    }

    public static void main(String[] args){
        System.out.println(valorAbsoluto(-15));
    }
}
