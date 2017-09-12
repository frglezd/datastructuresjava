

public class Ejercicio4_2 {

    public static void desconcertar(String dirigible){
        System.out.println(dirigible);
        sipo("ping", -5);
    }

    public static void sipo(String membrillo, int flag){
        if (flag < 0){
            System.out.println(membrillo + " sup");
            desconcertar (membrillo);
            System.out.println("fin");
        }
    }

    public static void main(String[] args){
        sipo("traqueteo", 1);
    }

}
