// See full code here:
// https://practice.geeksforgeeks.org/viewSol.php?subId=04677001d2efbb8ddfd1b44c340d790e&pid=700028&user=jay05thakare


// //Function to sort a linked list of 0s, 1s and 2s.
// static Node segregate(Node head)
// {
//     // add your code here
//     int n0 = 0;
//     int n1 = 0;
//     int n2 = 0;
    
//     Node curr = head;
    
//     while(curr != null){
//         if(curr.data == 0){
//             n0++;
//         }else if(curr.data == 1){
//             n1++;
//         }else{
//             n2++;
//         }
        
//         curr = curr.next;
//     }
    
//     curr = head;
    
//     while(curr != null){
//         if(n0 > 0){
//             curr.data = 0;
//             n0--;
//         }else if(n1 > 0){
//             curr.data = 1;
//             n1--;
//         }else{
//             curr.data = 2;
//             n2--;
//         }
        
//         curr = curr.next;
//     }
    
//     return head;
// }