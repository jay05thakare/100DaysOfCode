// N is special prime if N-2 && N+2 is prime too
// 5 is special prime coz, 3 and 7 are prime

public class D22Q4_Special_Prime_Num {

  public static boolean prime(int x) {
    for(int i = 2; i<x/2; i++){
      if(x % i == 0){
        return false;
      }
    }
    return true;
  }

  public static int isSpecialPrime(int A, int B) {
    int n = B - A;

    for(int i = A; i <= n; i++){
      if(prime(i)){
        if(prime(i-2) && prime(i+2)){
          return i;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int A = 4;
    int B = 10;

    System.out.println(isSpecialPrime(A, B));
  }
}
