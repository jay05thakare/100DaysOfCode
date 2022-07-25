// Java program for reversing the linked list

class D6Q1_Reverse_Linked_List {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
    System.out.println("null");
	}

	// Driver Code
	public static void main(String[] args)
	{
		D6Q1_Reverse_Linked_List list = new D6Q1_Reverse_Linked_List();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);

		head = list.reverse(head);
		
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

// This code has been contributed by Mayank Jaiswal
