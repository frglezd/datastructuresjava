public class TestNode4{


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

	Node.delete(start, 33);

	for (p = start; p != null; p = p.next) {
		System.out.println(p.data);
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


	static Node insert(Node start, int x) {
	// PRECONDITIONS: the list is in ascending order, and x>  start.data;
	// POSTCONDITIONS: the list is in ascending order, and it contains x;
	if (start == null || start.data > x) {
		start = new Node(x, start);
		return start;
	}
	Node p = start;
	while (p.next != null) {
		if(p.next.data > x) break;
		p = p.next;
	}

	p.next = new Node(x, p.next);
	return start;
	}

	static Node delete(Node start, int x) {
	// PRECONDITION: the list is in ascending order;
	// POSTCONDITIONS: the list is in ascending order, and if it did
	// contain x, then the first occurence of x has been deleted;
	if (start == null || start.data > x) { // case where x is not in the list
		return start;
	} else if (start.data == x) { // x is the first element in the list
		return start.next;
	}
	for (Node p = start; p.next != null; p = p.next) {
		if (p.next.data > x) {
			break;			// x is not in the list
		} else if(p.next.data == x) {	// x is in the p.next node
			p.next = p.next.next;	// deletion (nullified)
			break;
		}
	}
	return start;
	}

}
