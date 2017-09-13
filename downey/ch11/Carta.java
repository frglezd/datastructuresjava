
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
	
	public static void mismaCarta(Carta c1, Carta c2) {
		if(c1.naipe == c2.naipe && c1.valor == c2.valor) {
			System.out.println("Carta 1 y Carta 2 son iguales");
		} else {
			System.out.println("Carta 1 y Carta 2 son diferentes");
		}
	}
	
	public static void main(String[] args) {
		llenarMazo();
		Carta c1 = new Carta(3, 10);
		imprimirCarta(c1);
		Carta c2 = new Carta(3, 5);
		mismaCarta(c1, c2);
		imprimirMazo();
	}
}
