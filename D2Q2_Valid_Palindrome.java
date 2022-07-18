public class D2Q2_Valid_Palindrome {

  public static boolean validPalindrome(String str) {
    String fixed = "";

    for(char c : str.toCharArray()){
      if(Character.isDigit(c) || Character.isLetter(c)){
        fixed += c;
      }
    }

    fixed = fixed.toLowerCase();
    System.out.println(fixed);

    int si = 0;
    int ei = fixed.length()-1;

    while(si <= ei){
      if(fixed.charAt(si) != fixed.charAt(ei)){
        return false;
      }

      si++;
      ei--;
    }
    return true;
  }
  public static void main(String[] args) {
    String str = "A man, a plan, a canal: Panama";

    System.out.println("Valid Palindrome: " + validPalindrome(str));
  }
}
