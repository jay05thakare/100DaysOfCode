import java.util.*;

public class D19Q1_Find_Class_Of_IP_Address {

  public static int[] getNumArr(String str) {
    String[] strArr = str.split("\\.", 0);

    int intArr[] = new int[strArr.length];
    for(int i=0; i<strArr.length; i++){
      intArr[i] = Integer.valueOf(strArr[i]);
    }

    return intArr;
  }

  public static String classIs(String str) {
    int[] arr = getNumArr(str);

    if(arr[0] >= 0 && arr[0] < 128){
      return "A";
    }else if(arr[0] >= 128 && arr[0] < 192){
      return "B";
    }else if(arr[0] >= 192 && arr[0] < 224){
      return "C";
    }else if(arr[0] >= 224 && arr[0] < 240){
      return "D";
    }else if(arr[0] >= 240 && arr[0] < 255){
      return "D";
    }else{
      return "Invalid";
    }

  }
  public static void main(String[] args) {
    String ip = "128.192.255.255";

    int arr[] = getNumArr(ip);

    String ipClass = classIs(ip);

    System.out.println("Class is: " + ipClass);
    
    if(ipClass == "A"){
      System.out.println("NetID is: " + arr[0]);
      System.out.println("HostID is: " + arr[1] + "." + arr[2] + "." + arr[3]);
    }else if(ipClass == "B"){
      System.out.println("NetID is: " + arr[0] + "."  + arr[1]);
      System.out.println("HostID is: " + arr[2] + "." + arr[3]);
    }else if(ipClass == "C"){
      System.out.println("NetID is: " + arr[0] + "."  + arr[1] + "." + arr[2]);
      System.out.println("HostID is: " + arr[3]);
    }else if(ipClass == "D" || ipClass == "E"){
      System.out.println("Diversified or multicast IP address.");
    }else{
      System.out.println("Invalid IP");
    }

  }
}
