

class CuentaRegresivaRecursion{

    public static void cuentaRegresiva(int n){
        while(n>0){
            System.out.println(n);
            n = n-1;
        }
        System.out.println("...");
    }

    public static void main(String[] args){
        cuentaRegresiva(10);

    }

}
