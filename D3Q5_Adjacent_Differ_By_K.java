class D3Q5_Adjacent_Differ_By_K{

  public static int search(int arr[], int k, int x) {
    int n = arr.length;
    int i=0;
    
    while(i<n){
      if(x == arr[i]){
        return i;
      }
        i = i + Math.max(1, Math.abs(arr[i]- x) / k);
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = {20, 40, 50, 70, 70, 60};
    int k = 20;
    int x = 60;
    System.out.println(search(arr, k, x));
  }
}
