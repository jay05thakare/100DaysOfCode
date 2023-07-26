import java.util.Arrays;

class D34Q1_Next_Permutation {
    public static int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            Arrays.sort(arr);
            return arr;
        }

        for (int i = n - 1; i > idx; i--) {
            if (arr[idx] < arr[i]) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        idx++;
        int k = n - 1;

        while (idx < k) {
            int temp = arr[idx];
            arr[idx] = arr[k];
            arr[k] = temp;
            idx++;
            k--;
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };

        for (int i : nextPermutation(arr)) {

            System.out.println(i);
        }
    }
}
