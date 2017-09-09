import java.util.*;

class Log{

    public static void log(){
        double x = 1.0;
        while(x < 10.0) {
           System.out.println(x + " " + Math.log(x) / Math.log(2.0));
           x++;
        }
    }

    public static void main(String[] args){
        log();
    }

}
