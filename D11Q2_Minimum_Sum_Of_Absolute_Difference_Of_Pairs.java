// You are given two arrays A and B of equal length N. 
// Your task is to pair each element of array A to an element in array B, such that the sum of the absolute differences of all the pairs is minimum.

import java.util.*;

public class D11Q2_Minimum_Sum_Of_Absolute_Difference_Of_Pairs {

  static long findMinSum(int[] A,int[] B,int N) { 
    Arrays.sort(A);
    Arrays.sort(B);
    long sum = 0;
    
    for(int i = 0; i<N; i++){
        int sub = Math.abs(A[i] - B[i]);
        sum += sub;
    }
    
    return sum;
}

  public static void main(String[] args) {
    int A[] = {4,1,8,7};
    int B[] = {2,3,6,5};

    int N = A.length;

    System.out.println("Minimum Sum of Absolute Differences of Pairs is: " + findMinSum(A, B, N));
  }
}
