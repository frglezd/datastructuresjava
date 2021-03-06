
public class Complejo {
	
	double real, imag;
	
	//constructor sencillo que inicializa variables
	public Complejo(){
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	//constructor que toma dos parametros
	public Complejo(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public static void imprimirComplejo(Complejo c){
		System.out.println(c.real + " + " + c.imag + "i");
	}
	
	public static void conjugado(Complejo c){
		c.imag = -c.imag;
	}
	
	//abs es una funcion que devuelve un valor primitivo
	public static double abs(Complejo c){
		return Math.sqrt(c.real * c.real + c.imag * c.imag);
	}
	
	//sumar es una función que devuelve un nuevo Complejo
	public static Complejo suma(Complejo a, Complejo b){
		return new Complejo (a.real+b.real, a.imag + b.imag);
	}

	public static void main(String[] args){
		Complejo x = new Complejo();
		x.real = 1.0;
		x.imag = 2.0;
		
		// usa el segundo constructor
		Complejo y = new Complejo(3.0, 4.0);
		
		System.out.println(Complejo.abs(y));
		imprimirComplejo(y);
	}
}
