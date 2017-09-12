

class CuentaRegresiva{

    public static void cuentaRegresiva(int n){
        if(n==0){
            System.out.println("...");
        } else {
            System.out.println(n);
            cuentaRegresiva(n-1);
        }
    }

    public static void main(String[] args){
        cuentaRegresiva(10);
    }

}
