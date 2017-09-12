

class Ejercicio6_1{

    public static void ciclar(int n){
        int i = n;
        while(i >0){
            System.out.println(i);
            if (i%2 == 0){
                i = i/2;
            } else {
                i = i+1;
            }
        }
    }

    public static void main(String[] args){
        ciclar(10);

    }

}
