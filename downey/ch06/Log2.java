import java.util.*;

class Log2{

    public static void log(){
            System.out.println("Sucesión geométrica de 2");
        double x = 1.0;
        while(x < 100.0) {
           System.out.println(x + " " + Math.log(x) / Math.log(2.0));
           x = x * 2.0;
        }
    }

    public static void main(String[] args){
        log();
    }

}
