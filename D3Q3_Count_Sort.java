public class D3Q3_Count_Sort {
  public static void countSort(int arr[], int n) {
    // find max in given array
    int max = arr[0];
    for(int i=0; i<n; i++){
      if(max < arr[i]){
        max = arr[i];
      }
    }

    int countArr[] = new int[max+1];
    for(int i=0; i<n; i++){
      countArr[arr[i]] += 1;
    }

    // sorting array
    int i=0; // counter for countArr array
    int j=0; // counter for given array arr

    while(i<=max){
      if(countArr[i] > 0){
        arr[j] = i;
        countArr[i] -= 1;
        j++;
      }else{
        i++;
      }
    }
  }
  public static void main(String[] args) {
    int arr[] = {1, 4, 1, 2, 7, 5, 2};
      int n = arr.length;

      countSort(arr, n);
      System.out.print("The sorted array in O(1) TC is: ");
      for(int i=0; i<n; i++){
        System.out.print(arr[i]);
      }
  }
}
