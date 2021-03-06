
public class Racional {
	
	int numerador, denominador;
	
	//constructor sencillo del número racional
	public Racional(){
		this.numerador = 0;
		this.denominador = 0;
	}
	
	//constructor que toma los dos parámetros
	public Racional(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public static void imprimirRacional(Racional r){
		System.out.println(r.numerador + "/" + r.denominador);
	}
	
	public static void invertirSigno(Racional r){
		r.numerador = -1 * r.numerador;
		imprimirRacional(r);
	}
	
	public static void invertir(Racional r){
		int temp = r.numerador;
		r.numerador = r.denominador;
		r.denominador = temp;
		imprimirRacional(r);
	}
	
	public static double aDouble(Racional r){
		double numerador = r.numerador;
		double denominador = r.denominador;
		return numerador / denominador;
	}
	
	public static int gcd(int a, int b){
		if(b ==0){
			return a;
		}
		int r = a%b;
		return gcd(b,r);
	}
	
	public static void reducir(Racional r){
		int gcd = gcd(r.numerador, r.denominador);
		r.numerador = r.numerador / gcd;
		r.denominador = r.denominador / gcd;
		
		imprimirRacional(r);
	}
	
	public static void lcd(Racional r1, Racional r2){
		Racional r3 = new Racional();
		r3.denominador = r1.denominador * (r2.denominador/gcd(r1.denominador,r2.denominador));
		imprimirRacional(r3);
	}
	
	public static void main(String[] args){
		Racional r1 = new Racional(7,5);
		imprimirRacional(r1);
		invertirSigno(r1);
		invertir(r1);
		aDouble(r1);
		imprimirRacional(r1);
		Racional r2 = new Racional(25, 30);
		reducir(r2);
		imprimirRacional(r2);
		Racional r3 =  new Racional(1,2);
		Racional r4 = new Racional(3,4);
		reducir(r3);
		lcd(r3,r4);
	}

}
