import java.util.Stack;

public class D2Q4_Valid_Parentheses {

  public static boolean isOpening(char c){
    return c=='(' || c=='[' || c=='{';
  }

  public static boolean isMatching(char a, char b){
    return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
  }

  public static boolean validParentheses(String str) {
    int n = str.length();
    Stack<Character> stack = new Stack<Character>();

    for(int i = 0; i<n; i++){
      char curr = str.charAt(i);

      if(isOpening(curr)){
        stack.push(curr);
      }else{
        if(stack.isEmpty()){
          return false;
        }else{
          if(!isMatching(stack.peek(), curr)){
            return false;
          }else{
            stack.pop();
          }
        }
      }
    }
    return stack.isEmpty();
  }
  public static void main(String[] args) {
    String str = "{{[]()}}";

    System.out.println(str);
    System.out.println("Valid Parentheses: " + validParentheses(str));
  }
}
