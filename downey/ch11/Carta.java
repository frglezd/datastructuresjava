
public class Carta {

	int naipe, valor;
	static Carta[] mazo  = new Carta[52];
	
	public Carta() {
		this.naipe = 0;
		this.valor = 0;
	}
	
	public Carta(int naipe, int valor) {
		this.naipe =naipe;
		this.valor = valor;
	}
	
	public static void llenarMazo() {
		int indice = 0;
		for(int naipe = 0; naipe <=3; naipe++) {
			for (int valor = 1; valor <=13; valor++) {
				mazo[indice] = new Carta(naipe, valor);
				indice++;
			}
		}
	}
	
	public static void imprimirMazo() {
		for(int i= 0; i < mazo.length; i++) {
			imprimirCarta(mazo[i]);
		}
	}
	
	public static void imprimirCarta(Carta c) {
		String[] naipes = {"Tréboles", "Diamantes", "Corazones", "Espadas"};
		String[] valores = {"Nada", "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		System.out.println(valores[c.valor] + " de " + naipes[c.naipe] );
	}
	
	public static boolean mismaCarta(Carta c1, Carta c2) {
		if(c1.naipe == c2.naipe && c1.valor == c2.valor) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int compararCarta(Carta c1, Carta c2){
		if(c1.naipe > c2.naipe) return 1;
		if(c1.naipe< c2.naipe) return -1;
		if (c1.valor > c2.valor) return 1;
		if (c1.valor < c2.valor) return -1;
		return 0;
	}
	// búsqueda lineal de carta (argumentos de arreglo del objeto Carta[] (p.e., mazo
	// y objeto carta a buscar)
	public static int buscarCarta(Carta[] mazo, Carta c){
		for(int i= 0; i < mazo.length; i++){
			if(mismaCarta(mazo[i], c)) return i;
		}
		return -1;
	}
	
	public static int buscarBinario(Carta[] mazo, Carta c, int desde, int hasta){
		System.out.println (desde + ", " + hasta);
		if(hasta < desde) return -1;
		int medio = (hasta+desde)/2;
		int comp = compararCarta(mazo[medio], c);
		
		if(comp == 0){
			return medio;
		} else if (comp > 0){
			return buscarBinario(mazo, c, desde, medio-1);
		} else {
			return buscarBinario(mazo, c, medio+1, hasta);
		}
	}
	
	public static void intercambiarCartas(Carta c1, Carta c2){
		Carta temp = new Carta();
		temp.naipe = c1.naipe; temp.valor = c1.valor;
		c1.naipe = c2.naipe; c1.valor = c2.valor;
		c2.naipe = temp.naipe; c2.valor = temp.valor;
	}
	
	public static void main(String[] args) {
		llenarMazo();
		Carta c1 = new Carta(1, 5);
		Carta c2 = new Carta(2, 3);
		
		System.out.println(buscarCarta(mazo, c1));
		System.out.println(buscarBinario(mazo, c1, 0, mazo.length));
		
		intercambiarCartas(c1, c2);
		System.out.println(c1.naipe + " " + c1.valor);
		System.out.println(c2.naipe + " " + c2.valor);
	}
}
