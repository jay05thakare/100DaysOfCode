import java.util.*;

class D1Q1_Max_Min_of_Array{

  public static void minMax(int arr[]) {

    int min = Math.min(arr[0], arr[1]);
    int max = Math.max(arr[0], arr[1]);

    for(int i = 2; i<arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
      }else if(arr[i] > max){
        max = arr[i];
      }
    }

    System.out.println("Minimun is: " + min);
    System.out.println("Maximum is: " + max);
    System.out.println("Time complexity is O(n) ");
  }

  public static void main(String args[]) {
    int arr[] = {-2, 1, -4, 5, 3};

    minMax(arr);
  }
}