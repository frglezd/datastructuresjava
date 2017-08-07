import java.util.Arrays;

public class TestSort{
		String[] countries = {"CN", "IN", "US", "ID", "BR"};
		print(countries);
		Arrays.sort(countries);
		print(countries);
	}
	
	static <T> void print(T[] a) { // generic method
		for (T t : a) {
		System.out.printf("%s ", t);
		}
		System.out.println();		
	}
}
