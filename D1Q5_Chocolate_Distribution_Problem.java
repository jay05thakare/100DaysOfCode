import java.util.Arrays;

// Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// 1. Each student gets one packet.
// 2. The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.

class D1Q5_Chocolate_Distribution_Problem{

  public static void minDiff(int arr[], int m) {
    Arrays.sort(arr);

    int min = arr[arr.length - 1];
    for(int i = 0; i<arr.length-m; i++){
      int first = arr[i];
      int last = arr[i+2];

      int newMin = last - first;

      if(newMin < min){
        min = newMin;
      }
    }

    System.out.println("difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum is: " + min);
  }
  public static void main(String[] args){
    int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
    int noOfChildren = 5;

    minDiff(arr, noOfChildren);
  }
}