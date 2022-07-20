public class D4Q1_Ceiling_In_Sorted_Array {

  public static int ceilSearch(int arr[], int si, int ei, int x) {
    // approach 1
    // if(x <= arr[si]){
    //   return si;
    // }

    // for(int i = si; i<ei; i++){
    //   if(x == arr[i]){
    //     return i;
    //   }else if(arr[i] < x && arr[i+1] >=  x){
    //     return i+1;
    //   }
    // }
    // return -1;

    // approach 2 binary search

    while(si<=ei){
      int mid = si/2+ei/2;

      if(arr[mid] == x){
        return mid;
      }
      if(arr[mid] < x){
        si = mid+1;
      }else{
        ei = mid-1;
      }
    }
    return si;
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 8, 10, 10, 12, 19};
    int n = arr.length;
    int x = 19;
    int index = ceilSearch(arr, 0, n-1, x);
    if(index == -1)
      System.out.println("Ceiling of "+x+" doesn't exist in array");
    else
      System.out.println("ceiling of "+x+" is "+arr[index]);
  }
}
