
public class Ejercicio10_1 {

	public static double doubleAleatorio(double inferior, double superior){
		double diferencia = superior - inferior;
		return Math.random() * diferencia + inferior;
	}
	
	public static void main(String[] args){
		System.out.println(doubleAleatorio(30, 60));
	}
}
