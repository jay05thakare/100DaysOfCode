public class D33Q1_Sort0_1_2 {

    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static int[] sort_arr(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = 0;
        int k = n - 1;

        while (k >= j) {
            if (arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] == 2) {
                swap(arr, k, j);
                k--;
            } else {
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 2, 0, 0 };
        int[] sortedArr = sort_arr(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
