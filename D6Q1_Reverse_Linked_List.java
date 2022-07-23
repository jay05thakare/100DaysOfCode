import java.net.URI;

// Linkedlist implementation
public class D6Q1_Reverse_Linked_List {

  Node head;
  private int size;

  D6Q1_Reverse_Linked_List(){
    this.size = 0;
  }

  class Node{
    String data;
    Node next;

    Node(String data){
      this.data = data;
      this.next = null;
      size++;
    }
  }


  // add first 
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // add last
  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    Node currNode = head;
    while(currNode.next != null){
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }


  // delete first
  public void deleteFirst() {
    if(head == null){
      System.out.println("empty list");
      return;
    }

    size--;
    head = head.next;
  }

  // delete Last
  public void deleteLast() {
    if(head == null){
      System.out.println("empty list");
      return;
    }

    size--;
    if(head.next == null){
      head = null;
      return;
    }

    Node lastSecond =head;
    Node lastNode = head.next;

    while(lastNode.next != null){
      lastNode = lastNode.next;
      lastSecond = lastSecond.next;
    }

    lastSecond.next = null;

  }


  // print list
  public void printList(){
    if(head == null){
      System.out.println("LL empty");
    }

    Node currNode = head;
    while(currNode != null){
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }

    System.out.println("Null");

  }

  public int getSize() {
    return size;
  }


  // reverse the linked list usiing iteration, no more memory usage, <-
  public void reverseIterate() {
    
    Node prevNode = head;
    Node currNode = head.next;

    while(currNode != null){
      Node nextNode = currNode.next;
      currNode.next = prevNode;

      // update
      prevNode = currNode;
      currNode = nextNode;
    }

    head.next = null;
    head = prevNode;
  }

  // reverse the linked list usiing recursion,
  public Node reverseRecursive(Node head){
    if(head == null || head.next == null){
      return head;
    }
    Node newHead = reverseRecursive(head.next);

    head.next.next = head;
    head.next = null;
    return newHead;
  }


   public static void main(String args[]) {

    int arr[] = {1,2,3,4};
    System.out.println(7 + 2);
    
    D6Q1_Reverse_Linked_List list = new D6Q1_Reverse_Linked_List();

    list.addFirst("a");
    list.addFirst("is");

    list.printList();

    list.addLast("list");
    list.printList();
    
    list.addFirst("This");
    list.printList();
    
    list.deleteFirst();
    list.printList();
    
    list.deleteLast();
    list.printList();
    
    System.out.println(list.getSize());

    list.addLast("list");
    list.printList();
    
    list.addFirst("This");
    list.printList();

    list.reverseIterate();
    list.printList();

    list.head = list.reverseRecursive(list.head);
    list.printList();
  }
}


// // Linkedlist using collection framework
// import java.util.LinkedList;

// public class LL{
//   public static void main(String args[]) {
//     LinkedList<String> list = new LinkedList<String>();

//     list.addFirst("a");
//     list.addFirst("is");
//     System.out.println(list);

//     list.addLast("list");
//     System.out.println(list);

//     System.out.println(list.size());

//     for(int i=0; i<list.size(); i++){
//       System.out.print(list.get(i) + " -> ");
//     }
//     System.out.println("null");

//     list.removeFirst();
//     System.out.println(list);

//     list.removeLast();
//     System.out.println(list);


//   }
// }