import java.util.HashMap;
import java.util.Map;;

class D1Q4_Array_Contains_Duplicate {

  public static boolean containsDuplicate(int arr[]) {

    Map<Integer, Boolean> map = new HashMap<>();
    
    for(int i = 0; i<arr.length; i++){

      if(map.containsKey(arr[i])){
        return true;
      }else{
        map.put(arr[i], true);
      }
    }

    return false;
  }
  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 100,1};

    System.out.println(containsDuplicate(arr));
  }  
}
