import java.util.*;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		System.out.printf("set.isEmpty(): %b%n", set.isEmpty());
		Collections.addAll(set, "CN", "FR", "GB", "RU", "US");
		System.out.println(set);
		System.out.printf("set.size(): %d%n", set.size());
		System.out.printf("set.contains (\"GB\"): %b%n", set .contains("GB"));
		System.out.printf("set.contains (\"JP\"): %b%n", set .contains("JP"));
		System.out.printf("set.isEmpty(): %b%n", set.isEmpty());

	}
}
