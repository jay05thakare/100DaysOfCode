// Find my code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=cd4eb66d8f9031660e488b81e680c64b&pid=701339&user=jay05thakare



//Function to evaluate a postfix expression.
/*public static int evaluatePostFix(String S)
{
    // Your code here
    Stack<Integer> stack = new Stack<>();
    
    for(int i = 0; i<S.length(); i++){
        if(S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/'){
            int a = stack.pop();
            int b = stack.pop();
            
            switch(S.charAt(i)){
                case '+':
                    stack.push(b+a);
                    break;
                    
                case '-':
                    stack.push(b-a);
                    break;
                    
                case '*':
                    stack.push(b*a);
                    break;
                    
                case '/':
                    stack.push(b/a);
                    break;
            }
        }else{
            stack.push(S.charAt(i) - '0');
        }
    }
    
    return stack.pop();
}
*/