public class D22Q3_Grocery_Sale {

  static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
  
static int partition(int[] arr, int low, int high)
{
      
    // pivot
    int pivot = arr[high]; 
      
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
          
        if (arr[j] < pivot) 
        {
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
static void quickSort(int[] arr, int low, int high)
{
    if (low < high) 
    {
        int pi = partition(arr, low, high);
  
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

  public static int cheapest(int N, int A[]) {
    quickSort(A, 0, A.length-1);
    return A[1];
  }
  public static void main(String[] args) {
    int A[] = {3,6,5,2,1};
    int N = A.length;
    System.out.println(cheapest(N, A));
  }
}
