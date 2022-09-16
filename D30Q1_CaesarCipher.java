import java.io.*;
import java.util.*;

class D30Q1_CaesarCipher {
  // implementation of Encryption by using Caesar cipher program in Java //to keep
  // track of index
  public static final String alpha = "abcdefghijklmnopqrstuvwxyz";

  public static String encrypt(String message, int shiftKey) {
    // changing the given text to lowercase
    message = message.toLowerCase();
    String cipherText = "";
    for (int ii = 0; ii < message.length(); ii++) {
      int charPosition = alpha.indexOf(message.charAt(ii));
      int keyVal = (shiftKey + charPosition) % 26;
      char replaceVal = alpha.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
  }

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.next();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    System.out.println("\nEncrpyted msg:" + encrypt(message, key));
  } // main method ends
} // Solution Class End
