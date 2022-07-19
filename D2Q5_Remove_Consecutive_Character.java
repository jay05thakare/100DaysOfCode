public class D2Q5_Remove_Consecutive_Character {

  public static void consecutiveCharacter(String str) {
    String fixed = "";

    char curr = str.charAt(0);
    fixed += str.charAt(0);

    for(int i = 1; i<str.length(); i++){
      if(curr != str.charAt(i)){
        curr = str.charAt(i);
        fixed += curr;
      }
    }
    System.out.println("Unique characters are: "+fixed);
  }
  public static void main(String[] args) {
    String str = "caabbd";
    
    consecutiveCharacter(str);
  }
}
