// Check my solution here
// https://leetcode.com/submissions/detail/756347481/



// public class D7Q2_Merge_Sorted_Linked_List {
//   static Node head;

//   static class Node{
//     int data;
//     Node next;

//     Node(int d){
//       data = d;
//       next = null;
//     }
//   }

//   public void mergeLists(Node list1, Node list2){
//     Node temp_node = new Node(0);
//         Node curr_node = temp_node;
        
//         while(list1 != null && list2 != null){
//             if(list1.data < list2.data){
//                 curr_node.next = list1;
//                 list1 = list1.next;
//             }else{
//                 curr_node.next = list2;
//                 list2 = list2.next;
//             }
            
//             curr_node = curr_node.next;
//         }
        
//         if(list1 != null){
//             curr_node.next = list1;
//             list1 = list1.next;
//         }
//         if(list2 != null){
//             curr_node.next = list2;
//             list2 = list2.next;
//         }

//         // print temp_node list
//         while (temp_node != null) {
//           System.out.print(temp_node.data + "->");
//           temp_node = temp_node.next;
//         }
//         System.out.println("null");
        
//         return;
//   }

//   public static void main(String[] args) {
//     D7Q2_Merge_Sorted_Linked_List list1 = new D7Q2_Merge_Sorted_Linked_List();
//     D7Q2_Merge_Sorted_Linked_List list2 = new D7Q2_Merge_Sorted_Linked_List();

//     list1.head = new Node(1);
// 		list1.head.next = new Node(2);
// 		list1.head.next.next = new Node(4);

//     list2.head = new Node(1);
// 		list2.head.next = new Node(3);
// 		list2.head.next.next = new Node(6);
//   }
// }
