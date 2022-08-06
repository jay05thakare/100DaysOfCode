// See my full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=30c38184c58b61df63cbdfefa8218974&pid=700688&user=jay05thakare




/*
//Function to store the zig zag order traversal of tree in a list
ArrayList<Integer> zigZagTraversal(Node root)
{
    //Add your code here.
    ArrayList<Integer> ans = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    
    if(root == null){
        return ans;
    }
    
    q.add(root);
    int f = 1;
    
    while(!q.isEmpty()){
        ArrayList<Integer> temp = new ArrayList<>();
        int size = q.size();
        while(size != 0){
            Node t = q.remove();
            temp.add(t.data);
            if(t.left != null) q.add(t.left);
            if(t.right != null) q.add (t.right);
            size--;
        }
        if(f%2 == 0) Collections.reverse(temp);
        
        for(int i = 0; i<temp.size(); i++) {
         ans.add(temp.get(i));   
        }
        f += 1;
    }
    
    return ans;
}
*/