import java.util.Arrays;

public class D34Q3_Repeat_and_Missing {

    public static int[] repeat_missing(int[] arr) {
        int n = arr.length;

        int repeat = arr[0];
        int missing = arr[0];

        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]);
            idx -= 1;
            if (arr[idx] > 0) {
                arr[idx] = arr[idx] * -1;
            } else {
                repeat = Math.abs(arr[i]);
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        int[] result = { repeat, missing };

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 3 };

        System.out.println(Arrays.toString(repeat_missing(arr)));
    }
}
