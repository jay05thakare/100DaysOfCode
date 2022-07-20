import java.util.*;

public class D3Q4_Common_Element_in_Three_Arrays {

  public static void findCommon(int a[], int b[], int c[], int n1, int n2,int n3) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    HashSet<Integer> set3 = new HashSet<>();

    for(int i=0; i<n1; i++){
      set1.add(a[i]);
    }

    for(int i=0; i<n2; i++){
      set2.add(b[i]);
    }

    for(int i = 0; i<n3; i++){
      if(set1.contains(c[i]) && set2.contains(c[i])){
        if (set3.contains(c[i]) == false)
                System.out.print(c[i] + " ");
        set3.add(c[i]);
      }
    }
  }
  public static void main(String[] args) {
    int ar1[] = { 1, 5, 10, 20, 40, 80 };
    int ar2[] = { 6, 7, 20, 80, 100 };
    int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
    int n1 = ar1.length;
    int n2 = ar2.length;
    int n3 = ar3.length;
 
    System.out.print("Common Elements are: ");
    findCommon(ar1, ar2, ar3, n1, n2, n3);
  }
}
