class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 4;
        // Block 2:
        int[] a1 = {1, 1, 1, 1};
        // Block 3:
        int[] a2 = {1, 1, 1, 1};
        // Block 4:
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a1[j];
            }
            for (int j = i - 1; j < n; j++) {
                sum += a2[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
        // Block END.
    }
}
