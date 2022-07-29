
import java.util.*;

public class D10Q2_Max_Equal_Sum_Of_3_Stacks {

  public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
    // code here
        int sum1 = Arrays.stream(S1).sum();
        int sum2 = Arrays.stream(S2).sum();
        int sum3 = Arrays.stream(S3).sum();
    
    while(N1>0 && N2>0 && N3>0){
        
        int top1 =0, top2 = 0, top3 = 0;
      while (true)
      {
          // If any stack is empty
          if (top1 == N1 || top2 == N2 || top3 == N3)
             return 0;
      
          // If sum of all three stack are equal.
          if (sum1 == sum2 && sum2 == sum3)
             return sum1;
          
          // Finding the stack with maximum sum and
          // removing its top element.
          if (sum1 >= sum2 && sum1 >= sum3)
             sum1 -= S1[top1++];
          else if (sum2 >= sum1 && sum2 >= sum3)
             sum2 -= S2[top2++];
          else if (sum3 >= sum2 && sum3 >= sum1)
             sum3 -= S3[top3++];
       }
    }
    return 0;
}
  public static void main(String[] args) {
    int N1 = 3, N2 = 4, N3 = 2;
    int S1[] = {4,2,3};
    int S2[] = {1,1,2,3};
    int S3[]= {1,4};

    System.out.println("Maximum Equal sum of Three Stacks is: " + maxEqualSum(N1, N2, N3, S1, S2, S3));
  }
}
