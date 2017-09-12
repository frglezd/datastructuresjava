

class Ejercicio7_4{

    public static void main(String[] args){
        rarificar(5);
        System.out.println("");
        rarificar(4);
        System.out.println("");
int b=5;
        System.out.print(b/2);
    }

    public static void rarificar(int x){
        if(x == 0){
            return;
        } else {
            rarificar(x/2);
        }

        System.out.print(x%2);
    }

}
