
public class Arreglo {
	
	

	public static int clonarArreglo(int[] a){
		int[] b = new int[a.length];
		
		for(int i= 0; i < b.length; i++){
			b[i] = a[i];
		}
		return imprimirArreglo(b);
	}
	
	public static int imprimirArreglo(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		return 0;
	}
	
	public static int enRango(int[] a, int bajo, int alto){
		int contador = 0;
		for (int i=0; i < a.length; i++){
			if (a[i] >= bajo && a[i] < alto)
				contador ++;
		}
		return contador;
	}
	
	public static void main(String[] args){
	
		int[] cuenta = new int[3];
		cuenta[0] = 7;
		clonarArreglo(cuenta);
		int [] histograma = {60, 30, 40};
		
		
		System.out.println(enRango(histograma, 50, 70));
		
	}

}
