import java.util.*;

public class D3Q2_Permute_Arrays {

  public static boolean isPossible(int arr1[], int arr2[], int k) {
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for(int i = 0; i<arr1.length; i++){
      if((arr1[i] + arr2[arr1.length-1-i]) < k){
          return false;
      }
  }
  return true;
  }
  public static void main(String[] args) {
    int arr1[] = {2, 1, 4};
    int arr2[] = {7, 8, 9};
    int k = 10;

    System.out.println("Permute two arrays such that sum of every pair is greater or equal to " + k + ": " + isPossible(arr1, arr2, k));
  }
}
