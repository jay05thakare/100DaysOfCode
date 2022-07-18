class D2Q1_Search_in_Rotated_Sorted_Array{

  public static int Search(int arr[], int target) {
    int si = 0;
    int ei = arr.length-1;

    while(si <= ei){

      int mid = si + (ei-si)/2;

      if(arr[mid] == target){
        return mid;
      }

      if(arr[mid] > arr[si] ){
        if(target < arr[mid] && target >= arr[si]){
          ei = mid-1;
        }else{
          si = mid+1;
        }
      }else{
        if(target > arr[mid] && target <= arr[ei]){
          si = mid+1;
        }else{
          ei = mid-1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {4,5,6,7,0,1,2};
    int target = 0;

    System.out.println(Search(arr, target));
  }
}