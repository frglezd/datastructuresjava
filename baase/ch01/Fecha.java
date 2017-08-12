class Fecha {
	public Año año;
	public int mes;
	public int dia;

	public static class Año {

		public int numero;
		public boolean esBisiesto;

		public static Año copy(Año a) {

			Año a2 = new Año();
			a2.numero = a.numero;
			a2.esBisiesto = a.esBisiesto;
			return a2;
		}
	}

	public static Fecha copy(Fecha f) {

		Fecha f2 = new Fecha();
		f2.año = Año.copy(f.año);
		f2.mes = f.mes;
		f2.dia = f.dia;
		return f2;
	}

	public static int sigloPorOmision;
}
