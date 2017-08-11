import java.util.*;

public class TestArrayDeque {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		Collections.addAll(deque, "GB", "B", "C", "D");
		System.out.println(deque);
		System.out.println("deque.getFirst: " + deque.getFirst());
	}
}
