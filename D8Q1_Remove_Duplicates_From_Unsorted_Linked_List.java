// Find my solution here:
// https://practice.geeksforgeeks.org/viewSol.php?subId=8857659ef07709fd18b25f5758ab63f6&pid=700125&user=jay05thakare



// // Function to remove duplicates from unsorted linked list.
// public Node removeDuplicates(Node head) 
// {
//      // Your code here
//      HashSet<Integer> set = new HashSet<>();
     
//      Node curr = head;
//      Node prev = null;
     
//      while(curr != null){
//          if(set.contains(curr.data)){
//              prev.next = curr.next;
//          }else{
//              set.add(curr.data);
//              prev = curr;
//          }
//          curr = curr.next;
//      }
//      return head;
// }
