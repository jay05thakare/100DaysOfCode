// Greedy Algorithm to find Minimum number of Coins

import java.util.ArrayList;
import java.util.List;

public class D10Q1_Activity_Selection {

  public static List<Integer> minCoins(int N) {
    
        List<Integer> list = new ArrayList<Integer>();

        // // optimized method
        int rupee[] = {1,2,5,10,20,50,100,200,500,2000};
        int n = rupee.length;

        for(int i = n-1; i>=0; i--){
          while(N >= rupee[i]){
            N -= rupee[i];
            list.add(rupee[i]);
          }
        }

        return list;

        // // brutforce method
        // while(N != 0){
            
        // if((N / 2000) > 0){

        //     int div = N/2000;
        //     for(int i = 0; i< div; i++){
        //         list.add(2000);
        //     }
        //     N -= (2000*div);

        // }else if((N / 500) > 0){

        //     int div = N/500;
        //     for(int i = 0; i< div; i++){
        //         list.add(500);
        //     }
        //     N -= (500*div);

        // }else if((N / 200) > 0){

        //     int div = N/200;
        //     for(int i = 0; i< div; i++){
        //         list.add(200);
        //     }
        //     N -= (200*div);

        // }else if ((N / 100) > 0){

        //     int div = N/100;
        //     for(int i = 0; i< div; i++){
        //         list.add(100);
        //     }
        //     N -= (100*div);

        // }else if ((N / 50) > 0){

        //     int div = N/50;
        //     for(int i = 0; i< div; i++){
        //         list.add(50);
        //     }
        //     N -= (50*div);

        // }else if ((N / 20) > 0){

        //     int div = N/20;
        //     for(int i = 0; i< div; i++){
        //         list.add(20);
        //     }
        //     N -= (20*div);

        // }else if ((N / 10) > 0){

        //     int div = N/10;
        //     for(int i = 0; i< div; i++){
        //         list.add(10);
        //     }
        //     N -= (10*div);

        // }else if ((N / 5) > 0){

        //     int div = N/5;
        //     for(int i = 0; i< div; i++){
        //         list.add(5);
        //     }
        //     N -= (5*div);

        // }else if ((N / 2) > 0){

        //     int div = N/2;
        //     for(int i = 0; i< div; i++){
        //         list.add(2);
        //     }
        //     N -= (2*div);

        // }else{

        //     int div = N/1;
        //     for(int i = 0; i< div; i++){
        //         list.add(1);
        //     }
        //     N -= (1*div);

        // } 
        
        // }
        // return list;
  }
  public static void main(String[] args) {
   int N = 43;
   List<Integer> currency = new ArrayList<>();
   currency = minCoins(N);

   for(int i : currency){
    System.out.print(i + " ");
   }
  }
}
