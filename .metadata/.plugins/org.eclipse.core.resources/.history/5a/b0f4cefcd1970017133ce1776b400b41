class Tiempo{

    int hora, minuto;
    double segundo;

    public Tiempo(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0.0;
    }

    // transforma el double de segundos a formato tiempo
    public Tiempo(double segs){
        this.hora = (int) (segs/3600.0);
        segs -= this.hora * 3600.0;
        this.minuto = (int) (segs / 60);
        segs -= this.minuto * 60;
        this.segundo = segs;
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

/*    public static void sumarTiempo(Tiempo t1, Tiempo t2){
        Tiempo suma = new Tiempo();
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
*/
    public static void incrementar (Tiempo t, double segs){
        t.segundo += segs;

        while(t.segundo >= 60.0){
            t.segundo -=60.0;
            t.minuto +=1;
        } 
        while(t.minuto >= 60){
            t.minuto -= 60;
            t.hora += 1;
        }
        imprimirTiempo(t);
    }

    public static Tiempo incrementarTiempo(Tiempo t, double segs){
        double segundos = convertirASegundos(t) + segs;
        return new Tiempo(segundos);
    }

    public static double convertirASegundos(Tiempo t){
        int minutos = t.hora * 60 + t.minuto;
        double segundos = minutos * 60 + t.segundo;
        return segundos;
    }


    public static Tiempo sumarTiempo(Tiempo t1, Tiempo t2){
        double segundos = convertirASegundos(t1) + convertirASegundos(t2);
        return new Tiempo (segundos);       // llama a método Tiempo con parámetro double de segundos
    }

    public static void main(String[] args){
        Tiempo tiempo = new Tiempo();
        Tiempo tiempo2 = new Tiempo(1,2,30);
        imprimirTiempo(tiempo);
        imprimirTiempo(tiempo2);
        System.out.println(posterior(tiempo, tiempo2));
        System.out.println(convertirASegundos(tiempo2));
        sumarTiempo(tiempo, tiempo2);
        incrementar(tiempo2, 95);
        System.out.println(convertirASegundos(tiempo2));
        Tiempo tiempo3 = new Tiempo(7280);
        imprimirTiempo(tiempo3);
        imprimirTiempo(incrementarTiempo(tiempo3, 60));
    }
}
