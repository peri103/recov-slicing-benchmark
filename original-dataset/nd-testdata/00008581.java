class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] b = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int a_sum = 0;
            for (int j = 0; j <= i; j++) {
                a_sum += a[j];
            }
            // Block 7:
            int b_sum = 0;
            for (int j = i; j < n; j++) {
                b_sum += b[j];
            }
            // Block 8:
            if (ans < a_sum + b_sum) {
                // Block 9:
                ans = a_sum + b_sum;
            }
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
}
