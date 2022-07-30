// see my full code here:
// https://practice.geeksforgeeks.org/viewSol.php?subId=5fd0b5b33219573a5a35c5c27536c7ed&pid=700202&user=jay05thakare


// The idea is to print the last level first, then the second last level, and so on

/*
public ArrayList<Integer> reverseLevelOrder(Node node) 
{
    // code here
    ArrayList<Integer> list = new ArrayList<>();
    
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    
    while(!q.isEmpty()){
        Node curr = q.peek();
        q.remove();
        list.add(curr.data);
        
        if(curr.right != null){
            q.add(curr.right);
        }
        
        if(curr.left != null){
            q.add(curr.left);
        }
    }
    
    Collections.reverse(list);
    
    return list;

}

*/