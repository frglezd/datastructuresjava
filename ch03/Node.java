class Node {

	int data;
	Node next;

	Node(int data){
		this.data = data;
	}


public static void main(String[] args){

	Node start = new Node(22);
	start.next = new Node(33);
	
	// for loop to print a linked list
	
	for(Node p = start; p!= null; p = p. next){
		System.out.println(p.data);
	}
}

}
