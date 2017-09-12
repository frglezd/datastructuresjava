

class ImprimirLogaritmo{

    public static void imprimirLogaritmo(double x){
        if(x <= 0.0){
            System.out.println("Solo números positivos");
            // return termina la ejecución de un métdodo antes de terminarlo
            return;
        }
        double resultado = Math.log(x);
        System.out.println("El logaritmo de x es " + resultado);
    }

    public static void main(String[] args){
        imprimirLogaritmo(-4);
        imprimirLogaritmo(Math.exp(1));
        
    }
}
