

class AreaCirculo{
    public static double area(double x1, double y1, double x2, double y2){
        return 0;
    }
    
    public static double distancia(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static double circulo(double xc, double yc,double xp, double yp){

        return area(distancia(xc, yc, xp, yp), yp, yp, yp);
    }


    public static void main(String[] args){

       
        

    }


}
