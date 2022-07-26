// full code here:
// https://practice.geeksforgeeks.org/viewSol.php?subId=4f6a8a67162397f7442bbf250e64c19c&pid=700336&user=jay05thakare


// function to multiply two linked list
// public long multiplyTwoLists(Node l1,Node l2){
  
//   //add code here.
//   long  n1 = 0;
//   long  n2 = 0;
//   long  mod = 1000000007;
  
//   Node curr = l1;
//   while(curr != null){
//       n1 = (n1*10 + curr.data) % mod;
//       curr = curr.next;
//   }
  
//   curr = l2;
//   while(curr != null){
//       n2 = (n2*10 + curr.data) % mod;
//       curr = curr.next;
//   }
  
//   return ((n1*n2) % mod);
// }