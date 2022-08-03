public class D16Q2_Dotted_Decimal_IP_To_Binary_IP_Address {

  public static String convertDecimal(Integer ch) {
    int x = ch;
    int arr[] = {128, 64, 32, 16, 8, 4, 2, 1};
    String ans = "";

    for(int i = 0; i<arr.length; i++){
      if(x >= arr[i]){
        x -= arr[i];
        ans += "1";
      }else{
        ans += "0";
      }
    }

    return ans;
  }

  public static String dottedToBinaryIP(String str) {
    str+= ".";
    int n = str.length();

    
    String binary = "";

    String a = "";

    for(int i = 0; i<n-1; i++){
      if(Character.isDigit(str.charAt(i))){
        a += str.charAt(i);

        if(Character.isDigit(str.charAt(i+1))){
          continue;
        }

        int b = Integer.parseInt(a);
        // System.out.println(b);
        a = "";

        if(b > 255 || b < 0){
          return "Invalid IP";
        }

        String term = convertDecimal(b);
        binary += term;
      }else{
        binary += " ";
      }
    }

    return binary;
  }

  
  public static void main(String[] args) {
    String str = "128.128.128.128";

    System.out.println(dottedToBinaryIP(str));
  }
}
