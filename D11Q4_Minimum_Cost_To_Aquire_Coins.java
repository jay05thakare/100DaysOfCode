// You are given a list of N coins of different denominations. You can pay an amount equivalent to any 1 coin and can acquire that coin. In addition, once you have paid for a coin, we can choose at most K more coins and can acquire those for free. The task is to find the minimum amount required to acquire all the N coins for a given value of K.

import java.util.*;

public class D11Q4_Minimum_Cost_To_Aquire_Coins {
    
    public static int minAmount(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        int i = 0;
        
        while(n>i){
            i++;
            count++;
            n -= 3;
        }
        
        return count;
    }
	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5,6,78,9,7,6,5,4,1};
		int n = arr.length;
		
		System.out.print(minAmount(arr, n));
	}
}
