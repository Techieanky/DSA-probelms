public class MaximumWealthLeetCode {

    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};

        int ans = maximumWealth(accounts);

        System.out.println("Richest Customer Wealth :" + ans);
    }


    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int i : account) {

                rowSum += i;

            }

            if (rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }

        return maxWealth;
    }
}
