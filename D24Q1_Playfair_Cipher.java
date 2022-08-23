import java.util.HashSet;
import java.util.Iterator;
import java.io.*;
import java.util.*;

class Playfair{
  String key;
  String plainText;
  char[][] matrix = new char[5][5];

  public Playfair(String key, String plainText){
    this.key = key.toLowerCase();
    this.plainText = plainText.toLowerCase();
  }

  // remove duplicate vchar in a key
  public void removeKeyDuplicates() {
    LinkedHashSet<Character> set = new LinkedHashSet<>();

    String newKey = "";

    for(int i = 0; i<key.length(); i++){
      if(key.charAt(i) == 'j') continue;
      set.add(key.charAt(i));
    }

    Iterator it = set.iterator();

    while(it.hasNext()){
      newKey += it.next();
    }

    key = newKey;
    System.out.println("Key is : " + key);
  }

  // make cipher key table
  public void cipherKeyMatrix(){
    Set<Character> set = new HashSet<>();
    String phrase = "";

    // add key elements to the phrase
    for(int i = 0; i<key.length(); i++){
      if(key.charAt(i) == 'j'){
        continue;
      }
      set.add(key.charAt(i));
      phrase += key.charAt(i);
    }

    // add other char except chars in key
    for(int i = 0; i<26; i++){
      char ch = (char)(i+97);
      if(ch == 'j') continue;

      if(!set.contains(ch)){
        phrase += ch;
      }
    }
    // System.out.println(phrase);

    // create 2d matrix
    int idx = 0;
    for(int i = 0; i<5; i++){
      for(int j = 0; j<5; j++){
        matrix[i][j] = phrase.charAt(idx++);
      }
    }

    // print cipher matrix
    System.out.println("The cipher matrix is: ");
    for(int i = 0; i<5; i++){
      for(int j = 0; j<5; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  // modify the plain input text
  public void modifyText(){
    String newMsg = "";
        int len = plainText.length();
       
        for (int i = 0; i < len; i++){
            // replace j with i
            if (plainText.charAt(i) == 'j')
                newMsg += 'i';
            else
                newMsg += plainText.charAt(i);
        }
 
        // insert character 'x' in between same chars them
        for (int i = 0; i < newMsg.length(); i += 2){
            if (newMsg.charAt(i) == newMsg.charAt(i + 1)){
              newMsg = newMsg.substring(0, i + 1) + 'x' + newMsg.substring(i + 1);
            }
        }
       
        // make the plaintext of even length
        if (len % 2 == 1){
          newMsg += 'x';
        }
       
        plainText = newMsg;
        System.out.println("Final input text is: " + plainText);
  }

}

public class D24Q1_Playfair_Cipher {
  public static void main(String[] args) {
    String key = "Monarch";
    String plainText = "Hello";

    Playfair cipher = new Playfair(key, plainText);
    cipher.removeKeyDuplicates();
    cipher.cipherKeyMatrix();
    cipher.modifyText();

  }
}
