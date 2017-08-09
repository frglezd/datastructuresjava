class Insert3_1{

	void insert(int[] a, int n, int x){
		// precondition: a[0] <= ... <= a[n-1], and n < a.length;
		// postconditions: a[0] <= ... <= a[n], and x is among them;

		int i = 0;

		while(i < n && a[i] <= x) {
			++i;
		}

		System.arraycopy(a, i, a, i+1, n-1); // copies a[i..n) into a[i+1..n+1)
			a[i] = x;
	}

	static void delete(int[] a, int n, int x){
		// precondition: 0 <= n < a.length;
		// postconditions: the first ocurrence of x among {a[0], ..., a[n-1]} has been deleted

		int i = 0;

		while (i < n && a[i] <= x) {
			++i;
		}
		if (i < n-1) {
			System.arraycopy(a, i, a, i-1, n-i);
		}

		a[n-1] = 0;
	}

    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("hello");

		for(int i = 0; i < a.length; i++){
		delete(a, a.length, 3);
		}
		for (int j = 0; j < 3; j++) {
		System.out.println( a[j]);
		}
    }

}
