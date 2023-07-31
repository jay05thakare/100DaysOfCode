public class D35Q1_Trapping_Rainwater {

    public static int trap_water(int[] arr) {
        int n = arr.length - 1;

        int result = 0;
        int left_max = 0;
        int right_max = 0;

        int l = 0;
        int r = n;

        while (l < r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] > left_max) {
                    left_max = arr[l];
                } else {
                    result += left_max - arr[l];
                }
                l++;
            } else {
                if (arr[r] > right_max) {
                    right_max = arr[r];
                } else {
                    result += right_max - arr[r];
                }
                r--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(trap_water(arr));
    }
}
