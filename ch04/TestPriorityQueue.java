import java.util.*;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		Collections.addAll(queue, "CO", "UY", "EC", "AR");
		System.out.println(queue);
		System.out.printf("Removed %s%n", queue.remove());
		System.out.printf("Removed %s%n", queue.remove());
		System.out.println(queue);
		queue.add("PE");
		queue.add("BO");
		System.out.println(queue);
		System.out.printf("Removed %s%n", queue.remove());
		System.out.printf("Removed %s%n", queue.remove());
		System.out.println(queue);
	}
}
