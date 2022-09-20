import java.util.*;

public class D29Q1_Classless_IP {

  public static String plainNetAdd = "";

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

  public static String binaryToDottedIP(String str) {
    int n = str.length();
    String dottedIP = "";

    for (int i = 0; i < 4; i++) {
      int count = 8;
      int term = 0;
      int j = i * 8;

      while (count > 0) {
        char ch = str.charAt(j);
        int num = ch - '0';

        count--;
        term += (num * (Math.pow(2, count)));

        j++;
      }

      count = 8;
      String termString = Integer.toString(term);
      dottedIP += (termString + ".");
    }

    int m = dottedIP.length();
    dottedIP = dottedIP.substring(0, m - 1);

    return dottedIP;
  }

  public static String networkAddress(String mask, String ip) {

    String strip = ip.replaceAll("\\.", "");
    int arrIP[] = new int[32];
    for (int i = 0; i < strip.length(); i++) {
      int j = Character.getNumericValue(strip.charAt(i));
      arrIP[i] = j;
    }

    String strmask = mask.replaceAll("\\.", "");
    int arrMask[] = new int[32];
    for (int i = 0; i < strmask.length(); i++) {
      int j = Character.getNumericValue(strmask.charAt(i));
      arrMask[i] = j;
    }

    char arrNetAdd[] = new char[32];
    for (int i = 0; i < arrIP.length; i++) {
      int j = arrIP[i] & arrMask[i];
      arrNetAdd[i] = (char) j;
    }

    for (int i : arrNetAdd) {
      plainNetAdd += i;
    }

    String netAdd = binaryToDottedIP(plainNetAdd);

    return netAdd;
  }

  public static double numberOfHosts(int givenMask) {
    int power = 32 - givenMask;
    return Math.pow(2, power);
  }

  public static String FirstHostID(String strNetAdd) {
    // int intNetAdd = Integer.parseInt(strNetAdd);
    // intNetAdd += 1;

    // String strFHost = Integer.toString(intNetAdd);

    // System.out.println("strFHost" + strFHost);

    // String FHostID = binaryToDottedIP(strFHost);

    return "FHostID";
  }

  public static void main(String[] args) {
    String ip = "200.10.20.40/28";

    int givenMask = 28;

    String givenIP = "200.10.20.40";

    double hosts = numberOfHosts(givenMask);
    System.out.println("Number of hosts are: " + hosts);

    String mask = maskOfIP(givenMask);
    System.out.println("Mask is: " + mask);

    String binaryIP = dottedToBinaryIP(givenIP);
    System.out.println("Given IP:" + binaryIP);

    String networkAddress = networkAddress(mask, binaryIP);
    System.out.println("Subnet Address: " + networkAddress);

    String FirstHostID = FirstHostID(plainNetAdd);

  }
}
