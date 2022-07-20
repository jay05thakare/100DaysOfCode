import java.util.*;

public class D3Q1_Print_Duplicates {

  public static void printDuplicates(String str) {
    Map<Character, Integer> map = new HashMap<>();

    for(int i = 0; i<str.length(); i++){
      char ch = str.charAt(i);
      if(map.containsKey(ch)){
        map.put(ch, map.get(ch)+1);
      }else{
        map.put(ch, 1);
      }
    }

    for(Map.Entry<Character, Integer> mapElement : map.entrySet()){
      if(mapElement.getValue() > 1){
        System.out.println(mapElement.getKey() + " , count = " + mapElement.getValue());
      }
    }


  }
  public static void main(String[] args) {
    String str = "Jay Thakare";

    printDuplicates(str);
  }
}
