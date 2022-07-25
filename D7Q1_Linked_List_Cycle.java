public class D7Q1_Linked_List_Cycle {

  static Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){
      data = d;
      next = null;
    }
  }

  void hasCycle(){
    Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
              System.out.println("list has cycle");
                return;
            }
        }
        System.out.println("list doesn't has cycle");
        return;
  }
  public static void main(String[] args) {
    D7Q1_Linked_List_Cycle list = new D7Q1_Linked_List_Cycle();

    list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);

    // create loop for testing purpose
		list.head.next.next.next = list.head.next;

    list.hasCycle();
  }
}
