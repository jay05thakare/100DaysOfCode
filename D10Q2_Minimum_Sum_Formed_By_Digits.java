// Given an array of digits (values are from 0 to 9), find the minimum possible sum of two numbers formed from digits of the array. 
// All digits of given array must be used to form the two numbers.

import java.util.*;

public class D10Q2_Minimum_Sum_Formed_By_Digits {
  public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
        
        long a = 0;
        long b = 0;
        
        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                a = a*10 + arr[i];
            }else{
                b = b*10 + arr[i];
            }
            
        }
        
        return a+b;
    }
  public static void main(String[] args) {
    int arr[] = {6, 8, 4, 5, 2, 3};
    int n = arr.length;

    System.out.println("Min sum formed by digits is: " + minSum(arr, n));
  }
}
