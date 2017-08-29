import java.awt.*;

class salida{

	public static void main(String[] args){

		int x = 5;
		Point nada = new Point(1,2);

		System.out.println(pepe (x, nada)); // 12+1+2= 15
		System.out.println(x); // 5
		System.out.println(nada.x); // 1
		System.out.println(nada.y); // 2
	}

	public static int pepe( int x, Point p){

		x += 7;
		return x + p.x + p.y;
	}
}
