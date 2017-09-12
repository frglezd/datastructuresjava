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

        System.out.println(t.hora + " " + t.minuto + " " + t.segundo);
    }

    public static void main(String[] args){
        Tiempo tiempo = new Tiempo();
        Tiempo tiempo2 = new Tiempo(1,2,30);
        imprimirTiempo(tiempo);
        imprimirTiempo(tiempo2);
    }
}
