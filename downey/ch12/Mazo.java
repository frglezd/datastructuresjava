
public class Mazo {
	
	Carta[] cartas;
	
	public Mazo(int n){
		cartas = new Carta[n];
	}
	
	public Mazo(){
		cartas = new Carta[52];
		int indice = 0;
		for(int naipe=0; naipe <=3; naipe++){
			for(int valor = 1; valor <=13; valor++){
				cartas[indice] = new Carta(naipe, valor);
				indice++;
			}
		}
	}
	
	public static boolean mismaCarta(Mazo mazo, Carta c) {
		if(buscarCarta(mazo, c) == true) return true;
		
		return false;
	}
	
	public static boolean buscarCarta(Mazo mazo, Carta c){
		for(int i=0; i < mazo.cartas.length; i++){
			if(mazo.cartas[i].naipe == c.naipe && mazo.cartas[i].valor == c.valor) {
				return true;
			}
		}
		return false;
	}
	
	public static int aleatorio(int inferior, int superior){
		double diferencia = superior - inferior;
		return (int) (Math.random() * diferencia + inferior);
	}
	
	public static void mezclarMazo(Mazo mazo){
		for(int i =0; i < mazo.cartas.length; i++){
			
			Carta.intercambiarCartas(mazo.cartas[i], mazo.cartas[aleatorio(i, mazo.cartas.length)]);
			System.out.println(mazo.cartas[i].naipe + " " + mazo.cartas[i].valor);
		}
	}
	
	public static void ordenarCartas(Mazo mazo){
		for(int i = 0; i < mazo.cartas.length; i++){
			//intercambiarCartas(buscarCartaMasBaja(mazo
		}
	}
	public static void buscarCartaMasBaja(Mazo mazo, Carta indice){
		//indice = mazo.cartas[indice];
	}
	
	public static Mazo submazo(Mazo mazo, int menor, int mayor){
		Mazo sub = new Mazo(mayor-menor+1);
		for(int i=0; i < sub.cartas.length; i++){
			sub.cartas[i] = mazo.cartas[menor+i];
		}
		return sub;
	}

	public static void main(String[] args){
		Mazo mazo = new Mazo();
		
		mezclarMazo(mazo);
		System.out.println(mazo.cartas[28].naipe);
		
	}
}
