public class D14Q1_Binary_IP_To_Dotted_Decimal_IP {


  public static String binaryToDottedIP(String str) {
    int n = str.length();
    String dottedIP = "";

    if(n > 32 || n < 32){
      return "Invalid";
    }

    for(int i=0; i<4; i++){
      int count = 8;
      int term = 0;
      int j = i*8;

      while(count > 0){
        char ch = str.charAt(j);
        int num = ch - '0';

        count--;
        term += (num*(Math.pow(2, count)));

        j++;
      }

      count = 8;
      String termString = Integer.toString(term);
      dottedIP += (termString + ".");
    }

    int m = dottedIP.length();
    dottedIP = dottedIP.substring(0, m-1);
    
    return dottedIP;
  }
  public static void main(String[] args) {
    String str = "11000001000000010000000100000011";

    System.out.println(binaryToDottedIP(str));
  }
}
