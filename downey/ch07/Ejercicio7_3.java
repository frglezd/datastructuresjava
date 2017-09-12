

class Ejercicio7_3{

    public static void main(String[] args){
        
        int ultimoDigito, primerDigito;

        for(int i = 10; i < 100; i++){
            ultimoDigito = i % 10;
            primerDigito = i/10;

            System.out.println(i +  ": "+ ultimoDigito + primerDigito);

        }
    }

}
