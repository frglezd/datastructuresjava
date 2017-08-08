public class TestNode2{

	void insert(Node start, int x) {
	// PRECONDITIONS: the list is in ascending order, and x>  start.data;
	// POSTCONDITIONS: the list is in ascending order, and it contains x;
	Node p = start;
	while (p.next != null) {
		if(p.next.data > x) break;
		p = p.next;
	}

		p.next = new Node(x, p.next);
	}


	public static void main(String[] args){
	Node start = new Node(22);
	Node p = start;

	for (int i = 1; i < 5; i++) {
		p = p.next = new Node(22 + 11*i);
	}

	for (p = start; p != null; p = p.next) {
		System.out.println(p.data);
	}

	// memory addresses of the node
	for (p = start; p != null; p = p.next) {
		System.out.println("Value: " + p);
		System.out.println("Next value: " + p.next);
	}

	}
}

class Node{
	int data;
	Node next;

	Node (int data) {
		this.data = data;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
