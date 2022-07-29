// Find maximum height pyramid from the given array of objects


  import java.util.*;
  public class D11Q3_Height_Of_Pyramid {
    
    public static int heightPyramid(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        
        while(i<n){
            if((n-i) > i){
                count++;
                i += (i+1);
            }
        }
        return count;
    }
	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		
		System.out.print(heightPyramid(arr, n));
	}
}
