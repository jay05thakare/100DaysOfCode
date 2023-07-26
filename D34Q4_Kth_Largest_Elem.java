import java.util.PriorityQueue;

public class D34Q4_Kth_Largest_Elem {

    public static int kth_largest_elem(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for(int i = k; i< arr.length; i++){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int k = 2;

        System.out.println(kth_largest_elem(arr, k));
    }
}
