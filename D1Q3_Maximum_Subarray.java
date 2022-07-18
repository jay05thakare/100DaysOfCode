public class D1Q3_Maximum_Subarray {
  public static void maxSubarray(int arr[]) {
    
    //Kadane's Algo
    int currSum = 0;
    int max = arr[0];

    for(int i = 0; i<arr.length; i++){
      currSum += arr[i];

      if(currSum > max){
        max = currSum;
      }

      if(currSum < 0){
        currSum = 0;
      }
    }

    System.out.println("Maximum subarray is: " + max);
    System.out.println("Time complexity is O(n) ");
  }
  public static void main(String args[]) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

    maxSubarray(arr);
  }
}
