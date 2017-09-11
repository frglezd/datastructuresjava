import java.awt.*;

class Punto{

    public static void imprimirPunto(Point p){
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static void imprimirRectangulo(Rectangle r){
        System.out.println("(" + r.x + ", " + r.y + ") Width: " + r.width + " Height: " + r.height );
    }

    public static double distancia(Point p1, Point p2){
        double dx = (double)(p2.x - p1.x);
        double dy = (double)(p2.y - p1.y);
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }

    public static void buscarCentro(Rectangle caja){
        int x = caja.x + caja.width/2;
        int y = caja.y + caja.height/2;
        Point centro = new Point(x,y);
        imprimirPunto(centro);
    }

    public static void moverRect(Rectangle caja, int dx, int dy){
        imprimirRectangulo(caja);
        caja.x = caja.x + dx;
        caja.y = caja.y + dy;
        imprimirRectangulo(caja);
    }

    public static void main(String[] args){
       int a  = 5;
        Point p1 = new Point(3,5);
        Point p2 = new Point(5,3);
        Rectangle caja = new Rectangle(0, 0, 100, 200);
        imprimirPunto(p1);
        System.out.println(distancia(p1, p2));
        buscarCentro(caja);
        moverRect(caja, 50, 100);
        caja.grow(50,50);
        imprimirRectangulo(caja);
    }
}
