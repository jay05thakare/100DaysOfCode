public class D36Q1_Product_Except_Self {

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int p = 1;

        for (int i = 0; i < n; i++) {
            result[i] = p;
            p *= arr[i];
        }

        p = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= p;
            p *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        for (int i : productExceptSelf(nums)) {
            System.out.println(i);
        }
    }
}
