public class D17Q1_Pattern1 {

  public static void pattern(int n) {
    int count = n;
    int row = 0; 

    if(row > n){
      return;
    }

    while(count > 0){
      System.out.print(count + " ");
      count --;
    }
    row++;
    System.out.println();
    n--;
    pattern(n);
  }
  public static void main(String[] args) {
    int n = 4;

    pattern(n);
  }
}
