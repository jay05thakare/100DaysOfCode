public class D33Q2_Sort_Sorted_Arrays {

    public static int[] sort_arrs(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int idx = 0;

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[idx] = arr1[i];
                i++;
            } else {
                result[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while (i < n) {
            result[idx] = arr1[i];
            i++;
            idx++;
        }

        while (j < m) {
            result[idx] = arr2[j];
            j++;
            idx++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 3 };
        int[] arr2 = { 1, 2, 3, 4 };

        int[] sorted_array = sort_arrs(arr1, arr2);

        for (int i = 0; i < sorted_array.length; i++) {
            System.out.print(sorted_array[i] + " ");
        }
    }
}
