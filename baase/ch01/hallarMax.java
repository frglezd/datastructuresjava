class hallarMax {

	static int[] E = {1,2,7,4,5,6};

	static int hallarMax(){

		int max = E[0];
		for (int indice = 1; indice < E.length; indice++){
			if(max < E[indice])
				max = E[indice];
		}
		System.out.println(max);
		return 0;
	}

	public static void main(String[] args){
		hallarMax();
	}
}
