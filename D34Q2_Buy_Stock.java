public class D34Q2_Buy_Stock {

    public static int max_stock(int[] arr) {
        int max_profit = 0;
        int curr_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            curr_max += diff;

            if (curr_max > max_profit) {
                max_profit = curr_max;
            }

            if (curr_max < 0) {
                curr_max = 0;
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        System.out.println(max_stock(prices));
    }
}
