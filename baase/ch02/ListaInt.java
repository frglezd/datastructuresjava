import java.lang.*;

public class ListaInt {

	int elemento;
	ListaInt siguiente;

	/** La constante nil denota la lista vacía. */
	public static final	ListaInt nil = null;

	/** Condición previa: L no es nil.
	  * Devuelve: primer elemento de L. */
	public static int primero(ListaInt L) {
		return L.elemento;
	}

	/** Condición previa: L no es nil.
	* Devuelve: Lista de todos los elementos de L, excepto del 1ro. */
	public static ListaInt resto(ListaInt L){
	return L.siguiente;
	}

	/** Condición previa: ninguna.
	* Condición posterior: sea nuevaL el valor devuelto por cons.
	* Entonces: nuevaL se refiere a un objeto nuevo, nueva L no es nil,
	* primero(nuevaL) = nuevoElemento, resto(nuevaL) = listaVieja. */
	public static ListaInt cons(int nuevoElemento, ListaInt listaVieja){

		List nuevaL = new ListaInt();

		nuevaL.elemento = nuevoElemento;
		nuevaL.siguiente = listaVieja;
		return nuevaL;
	}
}
