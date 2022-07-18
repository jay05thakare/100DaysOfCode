import java.util.Arrays;

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