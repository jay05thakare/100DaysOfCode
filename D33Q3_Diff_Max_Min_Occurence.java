import java.util.HashMap;

public class D33Q3_Diff_Max_Min_Occurence {

    public static void max_min_occurence_diff(int[] arr, int limit) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int max = -1;
        int min = limit + 1;

        for (int value : hashMap.values()) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.println(max - min);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 2, 2, 2 };

        int limit = 100;

        max_min_occurence_diff(arr, limit);
    }
}
