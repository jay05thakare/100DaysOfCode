public class D29Q1_Classless_IP {

  public static String convertDecimal(Integer ch) {
    int x = ch;
    int arr[] = { 128, 64, 32, 16, 8, 4, 2, 1 };
    String ans = "";

    for (int i = 0; i < arr.length; i++) {
      if (x >= arr[i]) {
        x -= arr[i];
        ans += "1";
      } else {
        ans += "0";
      }
    }

    return ans;
  }

  public static String dottedToBinaryIP(String str) {
    str += ".";
    int n = str.length();

    String binary = "";

    String a = "";

    for (int i = 0; i < n - 1; i++) {
      if (Character.isDigit(str.charAt(i))) {
        a += str.charAt(i);

        if (Character.isDigit(str.charAt(i + 1))) {
          continue;
        }

        int b = Integer.parseInt(a);
        // System.out.println(b);
        a = "";

        if (b > 255 || b < 0) {
          return "Invalid IP";
        }

        String term = convertDecimal(b);
        binary += term;
      } else {
        binary += ".";
      }
    }

    return binary;
  }

  public static String maskOfIP(int n) {
    int mask = n;
    int count = 0;
    String maskString = "";
    for (int i = 0; i < 4; i++) {

      while (count != 8) {
        if (mask == 0) {
          for (int j = 0; j < (32 - n); j++) {
            maskString += '0';
          }
          return maskString;
        }
        mask--;
        maskString += '1';
        count++;
      }
      maskString += '.';
      count = 0;
    }
    return maskString;
  }

  public static void main(String[] args) {
    String ip = "200.10.20.40/28";

    int givenMask = 28;

    String givenIP = "200.10.20.40";

    String mask = maskOfIP(givenMask);
    System.out.println("Mask is: " + mask);

    String binaryIP = dottedToBinaryIP(givenIP);
    System.out.println("Given IP:" + binaryIP);

    // String a = "jay" && "jay";

  }
}
