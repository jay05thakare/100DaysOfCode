public class D5Q1_Search_2D_Matrix {

  public static void searchMatrix(int arr[][], int x){
    int n = arr.length;
    int i = 0, j = n-1;

    while(i<n && j >=0){
      if(x == arr[i][j]){
        System.out.println(i + " " + j);
        return;
      }
      if(x > arr[i][j]){
        i++;
      }else{
        j--;
      }
    }
    System.out.println("no pair exist");
    return;
  }
  public static void main(String[] args) {
    int arr[][] = {{1,2,3},{4,7,9},{5,8,11}};
    int x = 4;

    searchMatrix(arr,x);
  }
}
