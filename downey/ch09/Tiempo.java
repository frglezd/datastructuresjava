class Tiempo{

    int hora, minuto;
    double segundo;

    public Tiempo(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0.0;
    }

    //sobrecarga de constructor
    public Tiempo(int hora, int minuto, double segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public static void imprimirTiempo(Tiempo t){

        System.out.println(t.hora + ":" + t.minuto + ":" + t.segundo);
    }

    public static boolean posterior(Tiempo t1, Tiempo t2){
        if(t1.hora > t2.hora) return true;
        if(t1.hora < t2.hora) return false;

        if(t1.minuto > t2.minuto) return true;
        if(t1.minuto < t2.minuto) return false;

        if(t1.segundo > t2.segundo) return true;
        return false;
    }

    public static void sumarTiempo(Tiempo t1, Tiempo t2){
        Tiempo suma = new Tiempo();         // constructor vacío
        suma.hora = t1.hora + t2.hora;
        suma.minuto = t1.minuto + t2.minuto;
        suma.segundo = t1.segundo + t2.segundo;

        if(suma.segundo >= 60.0){
            suma.segundo -=60.0;
            suma.minuto +=1;
        } if (suma.minuto >= 60){
            suma.minuto -= 60;
            suma.hora += 1;
        }
        imprimirTiempo(suma);
    }

    public static void main(String[] args){
        Tiempo tiempo = new Tiempo();
        Tiempo tiempo2 = new Tiempo(1,2,30);
        imprimirTiempo(tiempo);
        imprimirTiempo(tiempo2);
        System.out.println(posterior(tiempo, tiempo2));
        sumarTiempo(tiempo, tiempo2);
    }
}
