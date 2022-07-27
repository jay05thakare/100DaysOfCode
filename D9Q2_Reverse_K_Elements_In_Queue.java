// Here's my full  code (ctrl + click)
// https://practice.geeksforgeeks.org/viewSol.php?subId=140377b8cf8259ea8bf9b7a2082618a9&pid=700649&user=jay05thakare



 // Function to reverse first k elements of a queue.
 /*
 Stack<Integer> stack = new Stack<>();
    
 public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
     // add code here.
     Queue<Integer> ans = new LinkedList<>();
     
     for(int i=0; i<k; i++){
         int top = q.remove();
         stack.push(top);
     }
     
     for(int i = 0; i<k; i++){
         int top = stack.pop();
         ans.add(top);
     }
     
     while(!q.isEmpty()){
         int top = q.remove();
         ans.add(top);
     }
     
     return ans;
 }
 */