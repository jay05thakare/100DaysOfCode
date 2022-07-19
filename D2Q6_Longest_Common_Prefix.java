public class D2Q6_Longest_Common_Prefix {

  public static String longestCommonPrefix(String strs[]) {
    int n = strs.length;

    if(n == 0) return "";

    String prefix = strs[0];

    for(int i=1; i<n; i++){
      while(i<n && strs[i].indexOf(prefix) != 0){
        prefix = prefix.substring(0, prefix.length()-1);
      }
    }
    return prefix;
  }
  public static void main(String[] args) {
    String strs[] = {"flower","flow","flight"};

    System.out.println("Longest common prefix is " + longestCommonPrefix(strs));
  }
}
