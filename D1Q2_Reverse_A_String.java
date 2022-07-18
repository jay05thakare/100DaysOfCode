class D1Q2_Reverse_A_String{

  public static void ReverseString(String str) {
    int n = str.length();
    String reversed = "";

    for(int i = n-1; i>=0; i--){
      reversed = reversed.concat(""+str.charAt(i));
    }

    System.out.println(reversed);
  }
  public static void main(String args[]) {
    String str = "Jay Thakare";

    ReverseString(str);
  }
}